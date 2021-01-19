package inheritconstructor;

public class Linux extends Computer{

    String cost;
    Linux(){
        System.out.println("Constructor Linux");
    }
    Linux(String cost){
        this.cost = cost;

    }
    public void setCost(String cost){
        this.cost = cost;
        System.out.println("high");

    }
    public void getCost(){
        System.out.println(cost);
       // return this.cost;

    }
}
