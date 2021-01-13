public class InheritanceMouse1 extends Inheritance_Mouse {

  private String texture = "Blue";

   public  void setColor(String color){
       this.texture = color;
    System.out.println(color);
}
public  String getColor(){
       System.out.println(texture);
       return this.texture;

}


}
