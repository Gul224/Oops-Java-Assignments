package Inheritance;
public class Main {
    public static void main(String [] args){
    Mouse1 m1 = new Mouse1();

        m1.leftClick();
        m1.rightClick();
        m1.scrollUp();
        m1.scrollDown();
        m1.getColor();
        m1.setColor("black");
        String color = m1.getColor();

//        m2.leftClick();
//        m2.rightClick();
//        m2.scrollUp();
//        m2.scrollDown();
//        m2.connect();



    }
}
//Inheritance is using methods/properties from a  generic class and making different versions of them