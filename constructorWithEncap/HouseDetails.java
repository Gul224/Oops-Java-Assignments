package constructorWithEncap;

public class HouseDetails {
    //data members
    private String name;
    private String floor;
    private String elevator;

    // constructors
  public HouseDetails(String name, String floor, String elevator){

      this.name = name;
      this.floor = floor;
      this.elevator = elevator;
  }
    // set methods
    public void setName(String name){
      this.name = name;

    }
    public void setFloor(String floor){
      this.floor = floor;

    }

    public void setElevator(String elevator){
      this.elevator = elevator;
    }
    // Get methods
    public String getName(){
      return name;
    }

    public String getFloor(){
      return floor;
    }

    public String getElevator(){
      return elevator;
    }

}
