class HotelBooking{
   private String guestName;
   private String roomType;
   private int nights;



    // Default constructor
    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking otherBooking) {
        this.guestName = otherBooking.guestName;
        this.roomType = otherBooking.roomType;
        this.nights = otherBooking.nights;
    }

    // Method to display booking information
    public void displayBookingInfo() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }

}


public class HotelBookingSystem {
    public static void main(String[] args) {

        HotelBooking booking1 = new HotelBooking();
        System.out.println("Booking 1 (Default Constructor):");
        booking1.displayBookingInfo();

        // Using parameterized constructor
        HotelBooking booking2 = new HotelBooking("Alice Johnson", "Deluxe", 3);
        System.out.println("\nBooking 2 (Parameterized Constructor):");
        booking2.displayBookingInfo();

        // Using copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("\nBooking 3 (Copy Constructor):");
        booking3.displayBookingInfo();


    }
}
