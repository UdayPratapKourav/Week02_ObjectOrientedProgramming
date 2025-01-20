
class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double costPerDay;

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
        this.costPerDay = 50.0;  // Assuming a default cost per day
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays, double costPerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
    }

    // Method to calculate total rental cost
    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Cost Per Day: $" + costPerDay);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
}

public class CarRentalSystem {
    public static void main(String[] args) {

        CarRental rental1 = new CarRental();
        System.out.println("Rental 1 (Default Constructor):");
        rental1.displayRentalDetails();

        // Using parameterized constructor
        CarRental rental2 = new CarRental("Alice Johnson", "Toyota Camry", 5, 40.0);
        System.out.println("\nRental 2 (Parameterized Constructor):");
        rental2.displayRentalDetails();

    }
}

