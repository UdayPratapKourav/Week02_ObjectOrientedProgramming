package assistedproblems.vehicletransportsystem;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(250.0, "Petrol", 6);
        Truck truck = new Truck(140.0, "Diesel", 15.0);
        Motorcycle motorcycle = new Motorcycle(200.0, "Petrol", false);

        Vehicle[] vehicles = {car, truck, motorcycle};

        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Information:");
            vehicle.displayInfo();
            System.out.println();
        }
    }


}
