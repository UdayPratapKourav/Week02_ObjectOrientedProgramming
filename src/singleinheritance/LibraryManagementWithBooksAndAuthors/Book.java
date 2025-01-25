package singleinheritance.LibraryManagementWithBooksAndAuthors;
public class Book {
  private String title;
  private String publicationYear;

  //constructor
    public Book(String title,String publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;

    }

    public void displayInfo(){
        System.out.println("Book title :"+title);
        System.out.println(("Book publication Year :"+publicationYear));
    }

}
