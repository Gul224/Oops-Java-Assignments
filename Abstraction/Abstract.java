package Abstraction;
abstract class Dog{

    public void bark(){
        System.out.println("Bark");
    }
    public abstract void cry();

} // Here bark method for all dogs is same
 class Pomeranian extends Dog{

   //your own cry method is implemented
    public void cry(){
        System.out.println("Pomeranian cried");
    }
 }
public class Abstract {

    public static void main(String[] args){
       Pomeranian p = new Pomeranian();

       p.bark();
       p.cry();
    }
}
