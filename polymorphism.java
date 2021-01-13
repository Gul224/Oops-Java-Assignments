class Human{
    public void talk(){
        System.out.println("Talk talk");
    }
}
class Gul extends Human{
  public void talk(){
      System.out.println("blah blah");
  }
}
class Baby extends Human{
    public void talk(){
        System.out.println("noise");
    }
}
public class polymorphism {
public static void main(String[] args){
    Gul g = new Gul();
    g.talk();
}
}
