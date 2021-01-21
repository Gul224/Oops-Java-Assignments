package arrays;

import java.util.HashMap;
import java.util.Map;

public class CountingNumwithArray {
    public static void main(String []  args){
        int[] a = {355,655,677,999};
//        for (int i =0;i<a.length; i++){
//            System.out.println(i);
//        }
        // Hashmap is a class with key and value , key is character and value is integer
        HashMap<Character,Integer> map = new HashMap<>();
        for (int n=0; n<a.length; n++){
            //convert string to int ,
            char[] charr = String.valueOf(n).toCharArray();
            // again using key n value for iteration
            map.put(charr[0], a[n]);

                }
        for (Map.Entry<Character,Integer> entry : map.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());

    }

        }


