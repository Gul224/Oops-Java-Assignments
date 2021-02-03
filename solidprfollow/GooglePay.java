package solidprfollow;

public class GooglePay implements PaymentManager{
    @Override
    public void getPayment() {
    System.out.println("Payment done by GooglePay");
    }

    @Override
    public void createPayment() {

    }
}
