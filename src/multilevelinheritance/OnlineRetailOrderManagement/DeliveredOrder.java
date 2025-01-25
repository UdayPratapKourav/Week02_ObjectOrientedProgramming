package multilevelinheritance.OnlineRetailOrderManagement;
public class DeliveredOrder extends ShippedOrder{
    private String deliveryDate;
    DeliveredOrder(String orderId,String orderDate,int trackingNumber,String deliveryDate){
        super(orderId,orderDate,trackingNumber);
        this.deliveryDate=deliveryDate;

    }
    public void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Deliver date of the product is :"+deliveryDate);
    }
}
