package singleinheritance.SmartHomeDevices;
public class Device {
    private String deviceId;
    private String status;

    public Device(String deviceId,String status){
        this.deviceId=deviceId;
        this.status=status;

    }

   public void desplay(){
       System.out.println("Device Id is :"+deviceId);
       System.out.println("Status is :"+status);
   }
}
