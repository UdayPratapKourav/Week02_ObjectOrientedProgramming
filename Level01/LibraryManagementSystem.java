import org.w3c.dom.ls.LSOutput;

class Book {
    private static String libraryName;  // Static variable shared across all books
    private String title;
    private String author;
    private final String isbn;  // Final variable to ensure isbn cannot be changed

    // Constructor using 'this' to initialize instance variables
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to update the library name
    public static void updateLibraryName(String libraryName) {
        Book.libraryName = libraryName;
    }

    // Static method to display the library name
    public static void displayLibraryName() {
        System.out.println("Library Name is: " + libraryName);
    }

    // Method to display book details with instanceof check
    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title is: " + title);
            System.out.println("Author is: " + author);
            System.out.println("ISBN is: " + isbn);
        } else {
            System.out.println("This object is not a Book.");
        }
    }
}


public class LibraryManagementSystem {
    public static void main(String[] args) {

            Book cpp = new Book("Learn C++", "Uday", "0123");
            Book.updateLibraryName("tit main");
            cpp.displayDetails();
            Book.displayLibraryName();






    }
}
