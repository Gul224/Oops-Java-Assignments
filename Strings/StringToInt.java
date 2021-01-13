package Strings;

public class StringToInt {
    public static void main(String[] args){

        String s = "100";
        //Convert string to int
        int n = Integer .parseInt(s);
        System.out.println(n + 4);
        //System.out.println(Integer.parseInt(s) + 4);

        int l = Integer.parseInt("3");
        System.out.println(l + 5);

        // here its printing string not adding
    String t =  "100";
    System.out.println(t + 10);

    //integer to String
        int m = 8;
        System.out.println(Integer.toString(m) + 1);

        String g = "age: 22";
        //regular expression
        g = g.replaceAll("\\D+", "");
        int a = Integer.parseInt(g);

        System.out.println(a + 2);

       int k = Integer.parseInt(g);
       System.out.println(k + 8);

    }


}
