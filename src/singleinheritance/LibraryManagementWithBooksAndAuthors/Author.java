
package singleinheritance.LibraryManagementWithBooksAndAuthors;
public class Author extends Book {
    private String name;
    private String bio;

    public Author(String name,String bio,String title,String publicationYear){
        super(title,publicationYear);
        this.name=name;
        this.bio=bio;

    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Author name:"+name);
        System.out.println("Author bio:"+bio);

    }
}
