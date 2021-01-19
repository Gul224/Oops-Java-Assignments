package inheritconstructor;

public class Main {
    public static void main(String[]  args){
        Linux l1 = new Linux();
        Linux l2 = new Linux("high");

        l1.getCost();
        l1.offDevice();
        l1.onDevice();
        l2.getCost();



        }
    }
