package assistedproblems.vehicletransportsystem;

public class Vehicle {
    private double maxSpeed;
    private String fuelType;

    Vehicle(double maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }

}
