class Product {
    private static double discount = 10.0;  // Discount as a percentage
    private String productName;
    private double price;
    private int quantity;
    private final int productId;  // Final product ID

    // Constructor using 'this' to initialize fields
    Product(String productName, double price, int quantity, int productId) {
        this.productId = productId;
        this.productName = productName;
        this.price = applyDiscount(price);
        this.quantity = quantity;
    }

    // Static method to update the discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Apply discount to the price
    private double applyDiscount(double originalPrice) {
        return originalPrice - (originalPrice * discount / 100);
    }

    // Method to display product details
    public void displayDetails() {
        if(this instanceof Product){
            System.out.println("Product Name: " + productName);
            System.out.println("Price After Discount: " + price);
            System.out.println("Product ID: " + productId);
            System.out.println("Quantity: " + quantity);
        }else{
            System.out.println("This object is not a Product");
        }
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        // Update and apply a new discount
        Product.updateDiscount(15.0);  // Set 15% discount

        // Create product objects
        Product p1 = new Product("Mobile", 20000.0, 10, 123);
        p1.displayDetails();

        Product p2 = new Product("iPhone", 150000.0, 5, 124);
        p2.displayDetails();
    }
}
