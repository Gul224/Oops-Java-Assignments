package stringManipulation;

import java.util.Locale;

public class Main {
    public static void main(String []  args){
        // place holder : %s is for strings, %d is for integers .  %f is for float
        String name = "Gul is %s years old";
        System.out.println(name.length());
        System.out.println(name.toUpperCase(Locale.ROOT));
        // use something which is not in your string, will give you -1
        System.out.println(name.indexOf("23"));

        int age = 23;
        System.out.printf(name, age);
    }
}
