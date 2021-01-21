package arrays;

public class OneDArray {
    public static void main(String []  args){
    //array of integers , provide size of an array , 4 boxes with 0 value
    int nums[] = new int[4];
    // can also write
      //  int nums[] = {8,12,76,54};

    nums[0] = 8;
    nums[1] = 12;
    nums[2] = 76;
    nums[3] = 54;

    // providing index value beyond
   // nums[4] = 77;
    // changing the values and trying to get the output
    nums[2] = 99;

     for (int i=0; i<4; i++){
     System.out.println(nums[i]);
     }
    //System.out.println(nums[3]);


}}
