package dipfollow;

public class ElectricPowerSwitchTest {
    public static void main(String[] args) {

    }
    public void testPress() throws Exception{
        Switchable switchableBulb = new LightBulb();
        Switch bulbPowerSwitch = new ElectricalPowerSwitch(switchableBulb);
        bulbPowerSwitch.press();
        bulbPowerSwitch.press();
        //System.out.println(bulbPowerSwitch.isOn());


        Switchable switchableFan = new Fan();
        Switch fanPowerSwitch = new ElectricalPowerSwitch(switchableFan);
        fanPowerSwitch.press();
        fanPowerSwitch.press();
      //  System.out.println("Fan Status: " + fanPowerSwitch.isOn());
    }


}
