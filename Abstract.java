
abstract class Dog{

    public void bark(){
        System.out.println("Bark");
    }
    public abstract void cry();

}
 class Pomeranian extends Dog{

    public void cry(){
        System.out.println("Dog cried");
    }
 }
public class Abstract {

    public static void main(String[] args){
       Pomeranian p = new Pomeranian();

       p.bark();
       p.cry();
    }
}
