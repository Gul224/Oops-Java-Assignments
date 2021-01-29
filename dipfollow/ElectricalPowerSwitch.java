package dipfollow;

public class ElectricalPowerSwitch implements Switch{
    public Switchable client;
    public boolean On;
    public ElectricalPowerSwitch(Switchable client){
        this.client = client;
        this.On = false;

    }
    @Override
    public boolean isOn() {
        return this.On;
    }

    @Override
    public void press() {
     boolean checkOn = isOn();
     if (checkOn){
         client.turnOff();
         this.On = false;

     }
     else {
         client.turnOn();
         this.On = true;
     }
    }
}
