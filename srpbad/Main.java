package srpbad;

public class Main {
    public static void main(String[] args) {
        Email email = new Email();
        email.sendSms("message");
        email.setReceiver("Gul");
        System.out.println();
    }
}
