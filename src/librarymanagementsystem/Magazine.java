package librarymanagementsystem;

public class Magazine extends LibraryItem{
    private int loanDuration=10;

    public Magazine(String itemId,String title,String author){
        super(itemId,title,author);
    }

    @Override
    public int getLoanDuration(int years) {
        return loanDuration;
    }

}
