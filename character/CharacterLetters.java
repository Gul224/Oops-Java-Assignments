package character;

public class CharacterLetters {
    public static void main(String [] args){
        char ch = '?';
        if (Character.isLetter(ch)){
            System.out.println("Yes, this is a letter");
            System.out.println(Character.isLetter(ch));

        }
        else {
            System.out.println("No, this is not a letter ");
        }
    }
}
