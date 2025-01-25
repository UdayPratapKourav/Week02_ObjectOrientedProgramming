package assistedproblems.vehicletransportsystem;

public class Truck extends Vehicle{
    private double loadCapacity; // in tons

    Truck(double maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }

}
