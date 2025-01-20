class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0;

    // Constructor to initialize product details
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + price);
    }

    // Static method to display total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

public class ProductInventory {
    public static void main(String[] args) {
        Product p1 = new Product("Book", 250.0);
        p1.displayProductDetails();
        Product p2 = new Product("Copy", 60.0);
        p2.displayProductDetails();
        Product p3 = new Product("Book2", 560.0);
        p3.displayProductDetails();

        Product.displayTotalProducts();
    }
}
