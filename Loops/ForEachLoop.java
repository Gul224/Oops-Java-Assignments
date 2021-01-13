package Loops;

public class ForEachLoop {
    public static void main(String[] args) {


        //for each loop, lets take array of string
//Array of string we have taken as phones
        String[] phones = {"Iphone", "Samsung", "Oneplus"};

        //it goes to phones and create a phone string
      for(String phone: phones){
          System.out.println(phone);
      }


      String [] animals ={"cat", "dog","goat"};
        for(String animal: animals){
            System.out.println(animal);

        }
//        for(int i = 0; i <15; i++){
//            System.out.println(i);
//        }
    }
}
