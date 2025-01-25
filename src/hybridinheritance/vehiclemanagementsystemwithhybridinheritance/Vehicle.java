package hybridinheritance.vehiclemanagementsystemwithhybridinheritance;

public class Vehicle { // attributes
private String model;
private int maxSpeed;

// constructor
Vehicle(String model, int maxSpeed) {
    this.maxSpeed = maxSpeed;
    this.model = model;
}

// default constructor
Vehicle() {
};

// display
void display() {
    System.out.println("\nModel is : " + model + " and max speed is : " + maxSpeed);
}
}

// Create an interface Refuelable with a method refuel().
interface Refuelable {
    public void refuel();
}

// Create an interface Chargable with a method charge().
interface Chargeable {
    public void charge();
}

// Define subclasses ElectricVehicle and PetrolVehicle. PetrolVehicle should
// implement Refuelable, while ElectricVehicle include a charge() method.

