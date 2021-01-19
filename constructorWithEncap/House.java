package constructorWithEncap;

public class House {
    public static void main(String []  args){
        //Using constructors to initialize
        HouseDetails myhome = new HouseDetails("Apartment" , "third", "yes");
//encapsulation
        //myhome.name = "first";
        // get
        System.out.println("Name: "+ myhome.getName()+ "  floor: "+myhome.getFloor()+ " elevator: "+myhome.getElevator());

        //set floor and elevator again

        myhome.setFloor("10th");
        myhome.setElevator("No");

        System.out.println("params after setting again");

        // using getter
        System.out.println("Name: "+ myhome.getName()+ "  floor: "+myhome.getFloor()+ "  elevator: "+myhome.getElevator());

    }
}
