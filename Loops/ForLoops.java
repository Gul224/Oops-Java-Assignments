package Loops;

public class ForLoops {
    public static void main(String[]  args){

        //to repeat code you use for loops
        //how many times you want to repeat and wht do you want to repeat
//        System.out.println("I love Dogs");
//        System.out.println("I love Dogs");
//        System.out.println("I love Dogs");
//        System.out.println("I love Dogs");

        //how many times
        for(int i = 0; i < 4; i++){
            //what you want to repeat
            System.out.println("Repeat this line ");
        }
// set a variable i, make it 15times and increment i by ++
     for(int i = 0; i <15; i++){
         System.out.println(i);
     }
     //here we are adding i as less than or equals 15, It will print until 15
     for(int i =0; i<=15; i++){
         System.out.println(i);
     }
     // provide grade value and run each
     int[] grades = {98, 100, 83, 90, 93};
     for (int i = 0; i< grades.length; i++){
         System.out.println(grades[i]);
     }

    }
}
