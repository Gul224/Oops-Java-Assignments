public class Abstract_Biryani {
private String dish;
private String Food;

  public void setDish(String newdish){
      dish = newdish;
  }
public String getDish(){
      return dish;
}

public void setFood(String newFood){
      Food = newFood;
}
public String getFood(){
      return Food;
}
public static void main(String[] args){
    Abstract_Biryani b = new Abstract_Biryani();
    b.setDish("Hyderabadi");
    b.setFood("Famous");

    System.out.println(b.getDish());
    System.out.println(b.getFood());
}
}
