import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Car.Car;
import Car.CarEconomy;
import Car.CarLuxury;
import Car.CarSUV;
import Person.IndividualPerson;
import Person.LegalPerson;
import Person.Person;
import exceptions.LoanDeniedException;
import exceptions.UnavailableCarException;

public class CarRentalAgency {
    private String name;
    private String address;
    private String phone;

    private List<Car> carInventory; 
    private List<Person> clientList;
    private List<Loan> loansList; 
    // As list não teram setters, não serão passados no construtor, na minha regre de negocio Locadora controla a existencia desses cara, então se deve adicionar um por um.


    public CarRentalAgency(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.carInventory = new ArrayList<>();
        this.clientList = new ArrayList<>();;
        this.loansList = new ArrayList<>();;
        
    }

    
    public void addCar(Car car){
        car.returnCar();
        carInventory.add(car);
    }

    public void registerClients(Person client){
        clientList.add(client);
    }
    public void rentCar(Car car){
        car.rentCar();
        carInventory.remove(car);
    }

    //para camada de apresentação:
    public List<Car> getCarInventory() {
        return Collections.unmodifiableList(carInventory);
    }
    //para camada de apresentação:
    public List<Loan> getLoansList() {
        return Collections.unmodifiableList(loansList);
    }

    
    public void generateLoan(Person client, Car car){
        //checar se o carro esta disponivel evitara que tenha que percorrer a lista de carros disponiveis, ao inves disso checo se carro esta disponivel, e depois removo da lista.
        if (!car.isAvailable())  throw new UnavailableCarException("Carro não disponivel para imprestimo");

        // uma  função que chega se o usuario pode fazer imprestimo com poimorfismo para cara usuario, tbm evita ter que percorrer imprestimos..
        if (!client.isEligibleForLoan()) throw new LoanDeniedException("Limite de imprestimos atingidos");

        // Caso as duas checagem passem, empresta carro, e cliente incrementa um imprestimo:
            this.rentCar(car);
            client.makeLoan();
            this.loansList.add(new Loan(client, car));
    }

    public boolean checkIfContainsLoan(int keyLoan){
        return ( keyLoan >= 0 && keyLoan <=  this.loansList.size() );
    }

    
    public boolean makeRenovation(int keyLoan){
        if (this.checkIfContainsLoan(keyLoan)){
           Loan loan = this.loansList.get(keyLoan);
            loan.realizeRenovation();
            return true;
        }
        return false;
    }
    public double endLoan(int keyLoan){
        if (!this.checkIfContainsLoan(keyLoan)) throw new IllegalArgumentException("Esse imprestimo não existe");
        
        //devolve carro
        Loan loan = this.loansList.get(keyLoan);
        Car carLoan = loan.getCar(); 
        this.addCar(carLoan);

        

        //encerra emprestimo de fato:
        loansList.remove(loan);

        //retorna valor do imprestimo
        return loan.calculateLoan();
        
    }

    
    
}
