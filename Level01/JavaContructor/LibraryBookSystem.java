class Book2{
   private String title;
   private String author;
   private double price;
   private boolean availability;

    Book2(String title,String author, double price,boolean availability){
       this.title=title;
       this.author=author;
       this.price=price;
       this.availability=availability;
   }


    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("You have successfully borrowed the book: " + title);
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is currently not available.");
        }
    }

    // Method to display book details
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
    }


}



public class LibraryBookSystem {
    public static void main(String[] args) {
     Book2 c= new Book2("cpp","uday",250.0,true );
        System.out.println("Book Information:");
        c.displayBookInfo();

        // Borrowing the book
        System.out.println("\nBorrowing the book...");
        c.borrowBook();

        // Trying to borrow the book again
        System.out.println("\nTrying to borrow the book again...");
        c.borrowBook();
    }
}
