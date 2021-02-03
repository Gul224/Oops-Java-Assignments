package solidprfollow;

public class DentalAppointment  implements AppointmentManager{

    // Passing Interface argument is liskov and Dependency inversion
    @Override
    public boolean createAppointment(Patient patient, Doctor doc) {
        if (doc.isDocAvailable()){
            Appointment dentalAppointment = new Appointment();
            dentalAppointment.setPatientId(patient.getPatientId());
            System.out.println("Create New Appointment for: " + patient.getFirstName());
            return true;
        }
        else {
            System.out.println("Doctor Not Available : Dental Appointment cant be made");
            return false;
        }


    }

    @Override
    public void confirmAppointment(PaymentManager paymentManager) {
        paymentManager.createPayment();
        System.out.println("Appointment Confirmed");
    }



}
//doctor