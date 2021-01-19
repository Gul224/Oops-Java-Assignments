package Loops;

public class Pattern {
    public static void main(String[] args) {
// 5 rows = for loop for rows
        for(int i = 0; i<5; i++){
            //2 columns - forloop for columns
            for(int j =0; j<2; j++){
                System.out.print("*");
            }
      System.out.println();
        }
        for(int i = 1; i<=5; i++){
            //
            for(int j =0; j<3; j++){
                System.out.print("*");
            }
            System.out.println();
        }

}

}