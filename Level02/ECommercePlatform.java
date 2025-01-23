import java.util.ArrayList;
import java.util.List;

// Product class
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Order class
class Order {
    private int orderId;
    private List<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}

// Customer class
class Customer1 {
    private String name;
    private List<Order> orders;

    public Customer1(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }
}

// Main class
public class ECommercePlatform {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Laptop", 800.0);
        Product product2 = new Product("Phone", 500.0);
        Product product3 = new Product("Headphones", 50.0);

        // Create a customer
        Customer1 customer = new Customer1("Alice");

        // Create an order and add products to it
        Order order1 = new Order(101);
        order1.addProduct(product1);
        order1.addProduct(product2);

        // Create another order and add a product to it
        Order order2 = new Order(102);
        order2.addProduct(product3);

        // Customer places orders
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // Display customer's orders and their details
        System.out.println("Customer: " + customer.getName());
        for (Order order : customer.getOrders()) {
            System.out.println("Order ID: " + order.getOrderId());
            System.out.println("Products in this order:");
            for (Product product : order.getProducts()) {
                System.out.println("- " + product.getName() + " ($" + product.getPrice() + ")");
            }
            System.out.println("Total for this order: $" + order.calculateTotal());
            System.out.println();
        }
    }
}
