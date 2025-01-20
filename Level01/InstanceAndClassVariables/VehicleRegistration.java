// Vehicle class to manage vehicle details
class Vehicle {
    // Instance variables to store individual vehicle details
    private String ownerName;
    private String vehicleType;

    // Static variable to store the registration fee, shared among all vehicles
    private static double registrationFee = 10000.0;

    // Constructor to initialize ownerName and vehicleType
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name is: " + ownerName);
        System.out.println("Vehicle Type is: " + vehicleType);
        System.out.println("Registration fee is: " + registrationFee);  // Displays shared static fee
    }

    // Static method to update the registration fee for all vehicles
    public static void updateRegistrationFee(double registrationFee) {
        Vehicle.registrationFee = registrationFee;  // Updates static variable
    }
}

// Main class to test the Vehicle class functionality
public class VehicleRegistration {
    public static void main(String[] args) {
        // Create first vehicle object and display its details
        Vehicle v1 = new Vehicle("Uday", "Car");
        v1.displayVehicleDetails();

        // Update the registration fee for all vehicles
        Vehicle.updateRegistrationFee(12000.0);

        // Create second vehicle object and display its details with the updated fee
        Vehicle v2 = new Vehicle("Pratap", "Bus");
        v2.displayVehicleDetails();
    }
}
