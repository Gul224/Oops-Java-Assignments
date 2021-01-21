package arrays;

public class TwoDArray {
    public static void main(String[]  args){
        // here array a has 4 values, instead of creating 4 variables, 1 array we have created

//        int a[] = {1,2,3,4};
//        int b[] = {2,4,6,8};
//        int c[] = {5,6,7,8};

        int d[][] = {
                {1,2,3,4},
                {2,4,6,8},
                {5,6,7,8},
        };
        // this loop will count no of rows
        for (int i=0;i<3; i++){
            //inner loop will count no of columns
            for (int j =0; j<4; j++){
             System.out.print("  "+ d[i][j]);

            }
            System.out.println();

    }}
}

