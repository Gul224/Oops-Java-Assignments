public class Methods {
    public static void main(String[] args){
        welcome();
        multiply(18,10);
        multiply(2,3);
        divide(20,5);
        divide(100,10);
        divide(66,11);


//        int a = 18;
//        int b = 10;
//        System.out.println(a*b);
        //we can just remove the above 3 lines and add multiply/divide method wth integers

        multiply(10,2);

//        int c = 10;
//        int d = 10;
//        System.out.println(c*d);

        // let just say we dont want to repeat the same steps everytime, thats where methods come in
    }
     public static void welcome(){
        System.out.println("Welcome to my calculation");
     }
    public static void multiply(int a,int b){
        System.out.println(a*b);
    }
public static void divide(int a, int b){
        System.out.println(a/b);
}


}
