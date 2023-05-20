package Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Car {
    // armazenar a marca, modelo, placa, ano e valor da locação: ]
    private String Brand;
    private String Model;
    private String licensePlate;
    private int Year;
    private double rentalPrice;
    private boolean isAvailable;
    protected int freeRenews;


    public Car(String Brand, String Model, String licensePlate, int Year, double rentalPrice) {
        this.Brand = Brand;
        this.Model = Model;
        this.licensePlate = licensePlate;
        this.Year = Year;
        this.rentalPrice = rentalPrice;
        // this.isAvailable = true;
    }

    public String getBrand() {
        return this.Brand;
    }

    public String getModel() {
        return this.Model;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }
  
    public int getYear() {
        return this.Year;
    }



    public double getRentalPrice() {
        return this.rentalPrice;
    }

    // public void setRentalPrice(double rentalPrice) {
    //     this.rentalPrice = rentalPrice;
    // }

   public boolean isAvailable(){
    return this.isAvailable;
    }

    public void rentCar() {
        this.isAvailable = false;
    }
    public void returnCar(){
        this.isAvailable = true;
    }
    public double calculeteRenovations(int countRenovations){
        if(countRenovations > this.freeRenews){
            return (countRenovations - freeRenews) * rentalPrice;
        }
        return 0;
    }
}