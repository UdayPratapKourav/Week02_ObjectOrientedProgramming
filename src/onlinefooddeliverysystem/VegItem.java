package onlinefooddeliverysystem;

public class VegItem extends FoodItem{
   private double additionalCharges=500;
   private double discount=10.0;

   public VegItem(String itemName,double price, int quantity){
       super(itemName,price,quantity);
   }
    public double calculateTotalPrice(){
        return getPrice() * getQuantity() +additionalCharges - applyDiscount();

    }

    @Override
    public double applyDiscount() {

        return (getPrice()*getQuantity()+additionalCharges)*(discount/100.0);
    }



    @Override
    public void getDiscountDetails() {
        System.out.println("Discount in item is : "+discount+" %");
    }

}
