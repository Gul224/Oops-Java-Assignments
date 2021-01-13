// Binding data with Method - Encapsulation
public class Encapsulation_Student {

   private int rollno;
   private String name;

   public int getRollno(){
       return rollno;
   }
    public void setRollno(int rollno){
       this.rollno = rollno;

    }
    public String getName(){
       return name;
}
public void setName(String name){
       this.name = name;
}
}
class Encapsulation
{
    public static void main(String [] args){
        Encapsulation_Student s1 = new Encapsulation_Student();
        s1.setRollno(2);
        s1.setName("Gul");

        System.out.println(s1.getRollno());
        System.out.println(s1.getName());
    }
}