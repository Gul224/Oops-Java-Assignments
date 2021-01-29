package dipfollow;

public class LightBulb implements Switchable{
    @Override
    public void turnOn() {
    System.out.println("LightBulb: Bulb turns Onn");
    }

    @Override
    public void turnOff() {
    System.out.println("LightBulb: LIght Bulb is Off");
    }
}
