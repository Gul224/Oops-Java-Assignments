package srpgood;

public class Main {
    public static void main(String[] args) {
        Email email = new Email();
        email.setSender("Sender name: Zemoso");
        email.setReceiver("Receiver name: Gul");

        SMS sms = new SMS();
        sms.sendSms("Message");

       // System.out.println();
    }
}
