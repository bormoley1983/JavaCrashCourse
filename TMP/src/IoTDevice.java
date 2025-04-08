public class IoTDevice {
    private String id;
    private String name;

    public IoTDevice(String id, String name){
        this.id = id;
        this.name = name;
    }

    public void performAction(){
        System.out.println ("Performing action for device : " + name);
    }

    public String getName(){
        return this.name;
    }

    public static void main(String[] args) {
        SmartLight sl = new SmartLight("1", "sl", true);
        SmartThermostat ts = new SmartThermostat("2", "ts");

        sl.performAction();
        ts.performAction();

        ts.setTemperature(15);
        ts.performAction();
    }
}

