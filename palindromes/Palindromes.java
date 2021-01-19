package palindromes;

public class Palindromes {
    public static void main(String[] args){
        // mom, dad, madam
        String something = "abcd";
       // char b =  'm';

        String reverse = "";
        for(int i = something.length()-1; i>=0; i--){
            reverse += something.charAt(i);
            System.out.println(reverse);
        }
      boolean palindrome = true;
        for(int i = 0; i< something.length(); i++){
            System.out.println(i);
        }

    }
}
