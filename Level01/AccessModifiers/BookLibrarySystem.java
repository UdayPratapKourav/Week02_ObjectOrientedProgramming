class Book {
    public String ISBN;
    protected String title;
    private String author;

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

  class EBook extends Book{
      public EBook(String ISBN, String title, String author) {
          super(ISBN, title, author);
      }

      // Method to display EBook details
      public void displayDetails() {
          // Accessing public field ISBN directly
          System.out.println("ISBN: " + ISBN);
          // Accessing protected field title directly
          System.out.println("Title: " + title);
          // Accessing private field author using public getter
          System.out.println("Author: " + getAuthor());
      }
  }



public class BookLibrarySystem {
    public static void main(String[] args) {
        // Create an instance of EBook
        EBook ebook = new EBook("978-3-16-148410-0", "Learn Java", "John Doe");

        // Display details using method from EBook class
        ebook.displayDetails();

        // Access public member directly
        System.out.println("Accessing ISBN directly: " + ebook.ISBN);

        // Access protected member directly (within the same package)
        System.out.println("Accessing title directly: " + ebook.title);

        // Attempt to access private member directly (will cause an error if uncommented)
        // System.out.println("Accessing author directly: " + ebook.author); // Not allowed

        // Using setter to update author
        ebook.setAuthor("Jane Doe");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }


}
