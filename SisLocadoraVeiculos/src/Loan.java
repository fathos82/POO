import Car.Car;
import Person.Person;

public class Loan {
    private Person client;
    private Car car;
    private int countRenovations;


    public Loan(Person client, Car car) {
        this.client = client;
        this.car = car;
        this.countRenovations = 0;
    }

    public Person getClient() {
        return this.client;
    }


    public Car getCar() {
        return this.car;
    }
    public void realizeRenovation() {
        this.countRenovations++;
    }

    public double calculateLoan(){
        return this.car.calculeteRenovations(this.countRenovations);
    }




    // public int getCountRenovations() {
    //     return this.countRenovations;
    // }




}
