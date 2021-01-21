package arrays;

public class RandomNums {
    public static void main(String []  args){

        String[]names;
        names = new String[5];
        names[0] = "Gul";
        names[1] = "Tom";
        names[2] = "Thanos";
        names[3] = "Alex";
        names[4] = "Neil";

        int random = (int) (Math.random()*5);
        // random= random+1;
        System.out.println("The Random number is: "  +random);
        System.out.println("The Random names is: "  +names[random]);
    }
}
