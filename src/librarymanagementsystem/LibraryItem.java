package librarymanagementsystem;

public abstract class LibraryItem implements Reservable {

    private String itemId;
    private String title;
    private String author;
    private boolean available;

    public LibraryItem(String itemId,String title,String author){
        this.itemId=itemId;
        this.title=title;
        this.author=author;
        this.available =true;

    }

   public abstract int getLoanDuration(int month);

   public void getItemDetails(){
       System.out.println("Item id is :"+itemId);
       System.out.println("Title is :"+title);
       System.out.println("Author is :"+author);
   }

    @Override
    public boolean checkAvailability() {
        return available;
    }

    @Override
    public void reserveItem() {
        System.out.println("Item reserved !");
        available=false;
    }
}
