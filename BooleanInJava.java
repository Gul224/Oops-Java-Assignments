public class BooleanInJava {

    public static void main(String[] args){

        boolean passedFloor = true;
        boolean missedFloor = false;
        boolean passedAllFloors = false;
        int floorCount = 0;


//        int b = 0;
//        boolean b = true;
//        System.out.println(b);
//
//        boolean c = (a ==0);

        if(passedFloor){
            System.out.println("We passed the first floor");
            floorCount = floorCount + 1;
        }
        if(missedFloor){
            System.out.println("We passed the second floor");
            floorCount = floorCount +1;
    }
        if(passedFloor){
            System.out.println("We passed the third floor");
            floorCount = floorCount +1;
}
      if(floorCount == 3){
       passedAllFloors = true;
      }

      //if one floor is missed it wont print congralute

      if (passedAllFloors){
          System.out.println("Congratulations you passed all the floors");
      }
    }
}
