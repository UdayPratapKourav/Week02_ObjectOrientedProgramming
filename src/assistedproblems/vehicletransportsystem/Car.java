package assistedproblems.vehicletransportsystem;

public class Car extends Vehicle{
    private int seatCapacity;

    Car(double maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }

}
