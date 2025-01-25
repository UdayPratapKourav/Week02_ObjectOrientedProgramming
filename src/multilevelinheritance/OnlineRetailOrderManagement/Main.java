package multilevelinheritance.OnlineRetailOrderManagement;
public class Main {
    public static void main(String[] args) {
        DeliveredOrder deliver=new DeliveredOrder("Ud123","26/01/2025",456,"30/01/2025");
        deliver.getOrderStatus();
    }
}