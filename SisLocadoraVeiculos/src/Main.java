import java.util.List;

import Car.Car;
import Car.CarEconomy;
import Car.CarLuxury;
import Car.CarSUV;
import Person.IndividualPerson;
import Person.LegalPerson;
import Person.Person;


public class Main {

    public static void main(String[] args) {
        Person p1 = new LegalPerson("Davi", "Rua 1", "9232", "43425");
        Person p2 = new IndividualPerson("Lucas", "Rua 2", "9232", "43425");

        // Car car1 = new CarEconomy("Uno", "Model 1", "@141rf3", 2004, 12.1, 2, 3 , true);
        Car car2 = new CarSUV("Car SUV", "Model 4", "13213", 199, 12.1, 3.5, "Boa", "Diesel");
        // Car car3 = new CarLuxury("Ferrari Spider", "Model S", "defof2", 2001, 123.4, 4);
        
        CarRentalAgency loc = new CarRentalAgency("CArrrrr", "Ceus", "Nao me ligue");
        // loc.addCar(car1);
        loc.addCar(car2);
        // loc.addCar(car3);

        loc.registerClients(p1);
        loc.registerClients(p2);

     
        // apenas listando carros disponiveis:
        List<Car> carroDisponiveis = loc.getCarInventory(); 
        for (Car car : carroDisponiveis) {
            System.out.println("Brand:"+car.getBrand());
            System.out.println("Model:"+car.getModel());
            System.out.println();
        }
        
        // emprestando carros:
        // loc.generateLoan(p2, car1);
        loc.generateLoan(p1, car2);
        

        // apenas emprestimos disponiveis:
        int countLaons = 0; 
        for (Loan loan : loc.getLoansList()) {
            System.out.println("Emprestimo numero "+countLaons+":");
            System.out.println("Client: " + loan.getClient().getName());
            System.out.println("Brand: " + loan.getCar().getBrand());
            System.out.println();
            countLaons++;
        }

        loc.makeRenovation(0);
        loc.makeRenovation(0);
        loc.makeRenovation(0);
        loc.makeRenovation(0);
        loc.makeRenovation(0);

        
        System.out.println("Valor Emprestimo: "+loc.endLoan(0));
        
        

    }
}
