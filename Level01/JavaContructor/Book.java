public class Book {
   private String title;
   private String author;
   private double price;

    // Default constructor
    Book() {
        this("Learn Cpp", "Uday", 250.0);
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void display() {
        System.out.println("Title of the Book is: " + title);
        System.out.println("Author of the Book is: " + author);
        System.out.println("Price of the Book is: " + price);
    }
}

class Main {
    public static void main(String[] args) {
        Book cpp = new Book();  // Creating object using default constructor
        System.out.println("Details of the book are:");
        cpp.display();  // Displaying book details
    }
}
