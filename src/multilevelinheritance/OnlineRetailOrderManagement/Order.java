package multilevelinheritance.OnlineRetailOrderManagement;
public class Order {
    private String orderId;
    private String orderDate;

    public Order(String orderId,String orderDate){
        this.orderDate=orderDate;
        this.orderId=orderId;


    }

    public void getOrderStatus(){
        System.out.println("Order Id of the Product is :"+orderId);
        System.out.println("Date of the order is :"+orderDate);
    }
}
