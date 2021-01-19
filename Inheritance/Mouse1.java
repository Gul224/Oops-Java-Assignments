package Inheritance;

public class Mouse1 extends Mouse {
    private String texture = "Blue";

     public  void setColor(String color) {
         this.texture = color;
        System.out.println(color);
     }
     public String getColor(){
         System.out.println(texture);
         return this.texture;
     }
}
