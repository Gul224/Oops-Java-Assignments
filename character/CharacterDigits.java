package character;

import static java.lang.Character.isLetter;

public class CharacterDigits
{
    public static void main(String []  args){
        // compilation
        char ch = '1';
      // data types n
//        char c = new Character();
//        int i = new Integer("2");
        //provide anything other than letters will pass else statement
        if (Character.isDigit(ch)){
            System.out.println("Yes, this is a number" );
           System.out.println(Character.isDigit(ch));
        }
        else {
            System.out.println("No this is not a number");
        }


    }
}
