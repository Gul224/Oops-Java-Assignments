import java.util.Scanner;

public class NamingConventions {
    // Class should start with upper case n full words
    //Interafaces follow the same rules as class

    public static void main(String[]  args){
        // variable should start with lower case
        int a = 5;

        //packages
        Scanner scan = new Scanner(System.in);
        //systemis the class with upper name n .in is a variable

int maxAge = 100; //MAX_AGE  underscore is the space added
//If the value of your integer never changes you should change the name to all caps ex: MAX_AGE
//Also will add the final keyword as this variable will not ever change

        final int MAX_AGE = 100;
        //also dd static infront to make sure it never changes

    }

}
