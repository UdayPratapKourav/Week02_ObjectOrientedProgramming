package onlinefooddeliverysystem;

public class Main {
    public static void main(String[] args) {
        FoodItem fone=new VegItem("Chapati",10.0,20);
        FoodItem ftwo=new NonVegItem("age",10.0,20);

        System.out.println("discount :"+ fone.applyDiscount());
        fone.getDiscountDetails();
        fone.getItemDetails();
        System.out.println("total price is :"+fone.calculateTotalPrice());

    }
}
