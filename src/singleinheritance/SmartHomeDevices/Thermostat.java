package singleinheritance.SmartHomeDevices;
public class Thermostat extends  Device{
    private int temperatureSetting;

    public Thermostat(int temperatureSetting,String deviceId,String status){
        super(deviceId,status);
        this.temperatureSetting=temperatureSetting;
    }

    @Override
    public void desplay() {
        super.desplay();
        System.out.println("Temperature of the device is :"+temperatureSetting);
    }

}
