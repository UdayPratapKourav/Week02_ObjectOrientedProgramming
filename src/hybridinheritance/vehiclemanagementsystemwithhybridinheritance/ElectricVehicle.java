package hybridinheritance.vehiclemanagementsystemwithhybridinheritance;

public class ElectricVehicle extends Vehicle implements Chargeable {

    // constructor
    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void charge() {
        System.out.println("Charging the vehicle");
    }

    @Override
    void display() {
        super.display();
    }

}
