package librarymanagementsystem;

public class Main {
    public static void main(String[] args) {

        LibraryItem dvd1 = new DVD("56", "Hello Hello", "ABCD");
        LibraryItem magazine1 = new Magazine("99", "Current Affi", "news");
        LibraryItem book1 = new Book("95", "Harry Potter", "Rishabh");

        // getting loan duration for all three library object
        System.out.println(dvd1.getLoanDuration(10));
        System.out.println(magazine1.getLoanDuration(20));
        System.out.println(book1.getLoanDuration(30));

        // reserving the book1 object
        book1.reserveItem();

        // checking availability
        System.out.println(dvd1.checkAvailability());
        System.out.println(magazine1.checkAvailability());
        // will give false as it is reserved
        System.out.println(book1.checkAvailability());

        // getting item details
        dvd1.getItemDetails();
        magazine1.getItemDetails();
        book1.getItemDetails();

    }
}
