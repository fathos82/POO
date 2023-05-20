package Car;
public class CarLuxury extends Car{

    
    private int airbagCount;
    private double trunkSize;
    private boolean hasGPS;

    public CarLuxury(String Brand, String Model, String licensePlate, int Year, double rentalPrice, int airbagCount, double trunkSize, boolean hasGPS) {
        super(Brand, Model, licensePlate, Year, rentalPrice);
        this.airbagCount = airbagCount;
        this.trunkSize = trunkSize;
        this.hasGPS = hasGPS;
        this.freeRenews = 5;
    }
    
    
    public int getAirbagCount() {
        return this.airbagCount;
    }

    public void setAirbagCount(int airbagCount) {
        this.airbagCount = airbagCount;
    }

    public double getTrunkSize() {
        return this.trunkSize;
    }

    public void setTrunkSize(int trunkSize) {
        this.trunkSize = trunkSize;
    }

    public boolean isHasGPS() {
        return this.hasGPS;
    }

    public boolean getHasGPS() {
        return this.hasGPS;
    }

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

}
