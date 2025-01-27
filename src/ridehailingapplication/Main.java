package ridehailingapplication;

// Main class to test the application
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("C101", "John Doe", 15.0);
        Vehicle bike = new Bike("B202", "Jane Smith", 10.0);
        Vehicle auto = new Auto("A303", "Alex Brown", 12.0);

        System.out.println(car.getVehicleDetails());
        System.out.println("Car Fare for 10 Km: " + car.calculateFare(10));

        System.out.println(bike.getVehicleDetails());
        System.out.println("Bike Fare for 10 Km: " + bike.calculateFare(10));

        System.out.println(auto.getVehicleDetails());
        System.out.println("Auto Fare for 10 Km: " + auto.calculateFare(10));

        // Testing GPS functionality
        GPS carGPS = (GPS) car;
        carGPS.updateLocation("Downtown");
        System.out.println("Car Current Location: " + carGPS.getCurrentLocation());
    }
}
