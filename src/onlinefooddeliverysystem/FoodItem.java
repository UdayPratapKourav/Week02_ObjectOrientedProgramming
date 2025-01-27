package onlinefooddeliverysystem;

public abstract class FoodItem implements Discountable{
    private String itemName;
    private double price;
    private int quantity;
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }




    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public FoodItem(String itemName,double price, int quantity){
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }

    public abstract double calculateTotalPrice();
    public void getItemDetails(){
        System.out.println("Item name is :"+itemName);
        System.out.println("Item price is :"+price);
        System.out.println("Item quantity is :"+quantity);

    }



}
