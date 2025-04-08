public class SmartLight extends IoTDevice {
    private boolean isOn;

    public SmartLight(String id, String name, boolean isOn){
        super(id, name);
        this.isOn = isOn;
    }

    @Override
    public void performAction(){
        this.isOn = !this.isOn;
        System.out.println ("Performing action for device : " + super.getName() + " status is:  " + (isOn ? "On" : "Off"));
    }
}
