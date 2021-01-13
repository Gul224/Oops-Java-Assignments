package Loops;

public class shapesLoop {
    public static void main(String[]   args){

//        int rows = 5;
//
//        for (int i = rows; i >= 1; --i) {
//            for (int j = 1; j <= i; ++j) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        int asterisk = 4;

        for (int n = 1; n <= asterisk; n++)
        {
            // if we try to get output here, we will get each asteriks per line until 4
          //  System.out.println("* ");
            for (int t = 1; t <= n; t++)
            {
                System.out.print("* ");
            }

            System.out.println("");
        }




    }
}
