package librarymanagementsystem;

public class Book extends LibraryItem{
    int loanDuration = 30;

    @Override
    public int getLoanDuration(int years) {
        return loanDuration;
    }
    public Book(String itemId,String title,String author){
        super(itemId,title,author);
    }




}
