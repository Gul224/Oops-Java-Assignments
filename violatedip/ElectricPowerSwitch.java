package violatedip;

public class ElectricPowerSwitch {
    // field referencing lightbulb
    public LightBulb lightBulb;
    public boolean On;
    public ElectricPowerSwitch(LightBulb lightBulb){
        this.lightBulb = lightBulb;
        this.On = false;
    }
    public boolean isOn(){
        return this.On;
    }
    public void press(){
        boolean checkOn = isOn();
        if (checkOn){
            lightBulb.turnOff();
            this.On = false;
        }
        else {
            lightBulb.turnOn();
            this.On = true;
        }
    }
}
