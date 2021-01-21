package arrays;

public class RandomNum {
    public static void main(String []  args){

        String[] actions;
        actions= new String[5];
        actions[0] = "sleep";
        actions[1] = "wakeup";
        actions[2] = "Eat";
        actions[3] = "Work";
        actions[4] = "Play";

        int random = (int) (Math.random()*5);

        System.out.println("The Random number is: "  +random);
        System.out.println("The Random action is: "  +actions[random]);
    }
}
