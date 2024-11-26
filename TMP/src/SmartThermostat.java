public class SmartThermostat extends IoTDevice {
    private int temperature;

    public SmartThermostat(String id, String name){
        super(id, name);
        temperature = 25;
    }

    @Override
    public void performAction() {
        System.out.println ("Performing action for device : " + super.getName() + " temperature: " + temperature);
    }
    
    public void setTemperature(int temperature){
        this.temperature = temperature;
    }
}
