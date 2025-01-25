package hybridinheritance.vehiclemanagementsystemwithhybridinheritance;

public class Main {
    public static void main(String[] args) {
    // create object
    PetrolVehicle petrolVehicle = new PetrolVehicle("xyz", 200);
    ElectricVehicle electricVehicle = new ElectricVehicle("Abc", 100);

    // call methods to display model name and max speed
    petrolVehicle.display();
    petrolVehicle.refuel();

    electricVehicle.display();
    electricVehicle.charge();
}
}
