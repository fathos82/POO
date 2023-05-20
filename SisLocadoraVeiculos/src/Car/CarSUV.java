package Car;
public class CarSUV extends Car{
    private double trunkSize;
    private String tractionType;
    private String fuelType;

    public CarSUV(String Brand, String Model, String licensePlate, int Year, double rentalPrice, double trunkSize, String tractionType, String fuelType) {
        super(Brand, Model, licensePlate, Year, rentalPrice);
        this.trunkSize = trunkSize;
        this.tractionType = tractionType;
        this.fuelType = fuelType;
        this.freeRenews = 3;
    }

    public double getTrunkSize() {
        return this.trunkSize;
    }

    public String getTractionType() {
        return this.tractionType;
    }

    public String getFuelType() {
        return this.fuelType;
    }
}
