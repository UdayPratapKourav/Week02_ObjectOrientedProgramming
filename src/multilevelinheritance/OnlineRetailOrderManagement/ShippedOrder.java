package multilevelinheritance.OnlineRetailOrderManagement;
public class ShippedOrder extends Order{
    private int trackingNumber;
    public ShippedOrder(String orderId,String orderDate,int trackingNumber){
        super(orderId,orderDate);
        this.trackingNumber=trackingNumber;

    }
    public void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Tracking Number of the Product is :"+trackingNumber);

    }

}
