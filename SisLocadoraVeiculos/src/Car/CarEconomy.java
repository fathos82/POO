package Car;
public class CarEconomy extends Car{
    private boolean hasAir;

    public CarEconomy(String Brand, String Model, String licensePlate, int Year, double rentalPrice, boolean hasAir,
            boolean isAvailable) {
        super(Brand, Model, licensePlate, Year, rentalPrice);
        this.hasAir = hasAir;
        this.freeRenews = 1;
    }
    
    
}
