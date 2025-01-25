package hybridinheritance.vehiclemanagementsystemwithhybridinheritance;

public class PetrolVehicle extends Vehicle implements Refuelable {

    // constructor
    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println("refueling the vehicle");
    }

    @Override
    void display() {
        super.display();
    }
}
