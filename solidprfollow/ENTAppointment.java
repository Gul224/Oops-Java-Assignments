package solidprfollow;

public class ENTAppointment implements AppointmentManager{

    @Override
    public boolean createAppointment(Patient patient, Doctor doctor) {
        if (doctor.isDocAvailable()){
            Appointment entAppointment = new Appointment();
            entAppointment.setPatientId(patient.getPatientId());
            System.out.println("Create New Appointment for: " + patient.getFirstName());
            return true;
        }
        else {
            System.out.println("Doctor Not Available: ENT Appointment cant be made");
            return false;
        }

    }

    @Override
    public void confirmAppointment(PaymentManager paymentManager) {
    paymentManager.createPayment();

        System.out.println("Confirmed New ENT Appointment");
    }




    }


//int appointmentId, PaymentManager paymentManager