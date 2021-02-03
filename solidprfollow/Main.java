package solidprfollow;

public class Main {
    public static void main(String[] args) {
        PaymentManager paytm = new Paytm();

        PaymentManager googlePay = new GooglePay();

        //
        Patient dentalPatient = new Patient();
        dentalPatient.setFirstName("Gul");
        dentalPatient.setLastName("S");
        dentalPatient.setBloodGroup("O+");
        dentalPatient.setPatientId("12");
        dentalPatient.setPhoneNo("123456789");
        dentalPatient.setEmail("gul@gmail.com");

        Doctor doc = new Doctor();
        doc.setDocName("Dr. Alex");
        doc.setDocID("11");
        doc.setDocAvailable(true);

        Doctor doc2 = new Doctor();
        doc2.setDocName("Dr.White");
        doc2.setDocID("10");
        doc2.setDocAvailable(false);


        AppointmentManager dental = new DentalAppointment();
        AppointmentManager ent = new ENTAppointment();


        // booking Appointments

        boolean isAppointmentCreated = dental.createAppointment(dentalPatient, doc);
        if (isAppointmentCreated)
        dental.confirmAppointment(paytm);

       boolean isEntAppointmentCreated = ent.createAppointment(dentalPatient, doc2);
       if (isEntAppointmentCreated)
        ent.confirmAppointment(googlePay);


    }
}
// add constructor