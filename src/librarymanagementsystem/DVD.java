package librarymanagementsystem;

public class DVD extends LibraryItem{
    private int loanDuration=12;

    public DVD(String itemId,String title,String author){
        super(itemId,title,author);
    }

    @Override
    public int getLoanDuration(int years) {
        return loanDuration;
    }

}
