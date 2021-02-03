package solidprviolate;

public class Main {
    public static void main(String[] args) {

        Person patient = new Person();
        patient.setFirstName("Tom");
        patient.setLastName(" Alex");
       // patient.confirmAppointment();
        System.out.println("Patient name is :" + patient.FirstName +  patient.LastName);

        PaymentManager amount = new PaymentManager();
        amount.setAmount("1000");
        amount.setPaymentMode(amount.googlePay);
        System.out.println("Payment mode is: " + amount);

    }
}
