package solidprfollow;

import java.util.ArrayList;
import java.util.List;

//Follows SRP, OCP
public class Patient extends Person{
       public String patientId;
       public String bloodGroup;
       private List<String> allergies = new ArrayList<>();


       public String getPatientId() {
              return patientId;
       }

       public void setPatientId(String patientId) {
              this.patientId = patientId;
       }

       public String getBloodGroup() {
              return bloodGroup;
       }

       public void setBloodGroup(String bloodGroup) {
              this.bloodGroup = bloodGroup;
       }

       public List <String> getAllergies() {
              return  allergies ;
       }

       public void  addAllergies(String allergy) {
            allergies.add(allergy);
              //this.allergies = allergies;
       }


       //SRP Violate
//       public String getReport(){
//              return "report";
//       }

}
