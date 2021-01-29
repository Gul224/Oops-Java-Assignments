package liskovexamplegood;

public class Duck extends NonFlight{
    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void eat() {
        super.eat();
    }
}
