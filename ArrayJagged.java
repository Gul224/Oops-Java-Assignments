package arrays;

public class ArrayJagged {
    public static void main(String[]  args){

        int a[] = {11,20,30,89};
        int b[] = {21,14,26,77};
        int c[] = {34,88,52,11};

        int d[][] = { {11,20,30,89,90},
                {21,14,26},
                {34,88,52,11}

        };
        for (int i =0; i<d.length; i++){
            for (int n = 0; n<d[i].length; n++){
                System.out.print("  "+ d[i][n]);

            }
            System.out.println();
        }

    }
}
