package liskovexample;

public class Ostrich extends Bird{
    @Override
    public void fly() {
        throw new UnsupportedOperationException();

    }
}
