class Vehicle {
    private static double registrationFee = 500.0;  // Static registration fee shared across all vehicles
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;  // Final variable for unique registration number

    // Constructor using 'this' to initialize fields
    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Method to display vehicle details
    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("This object is not a Vehicle.");
        }
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        // Update the registration fee
        Vehicle.updateRegistrationFee(700.0);

        // Create vehicle objects
        Vehicle car = new Vehicle("Alice", "Car", "CAR1234");
        Vehicle bike = new Vehicle("Bob", "Bike", "BIKE5678");

        // Display vehicle details
        car.displayRegistrationDetails();
        bike.displayRegistrationDetails();
    }
}
