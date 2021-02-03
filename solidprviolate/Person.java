package solidprviolate;

// Violate Open-close
public class Person  {
     String FirstName;
     String LastName;
     String phoneNo;
     String email;
     String patientId;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
       this.FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }


}
