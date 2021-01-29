package liskovexamplegood;

import liskovexample.Bird;
import liskovexample.Crow;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FlightBird> birdsList = new ArrayList<FlightBird>();
        birdsList.add(new Eagle());

        List<NonFlight> birdsLists = new ArrayList<NonFlight>();
        birdsLists.add(new Duck());


//     System.out.println("Flying birds: "+ birdsList.add(new Eagle()));
//     System.out.println("Flying Birds: " + birdsLists.add(new Duck()));


       for (int i = 0; i<birdsList.size(); i++){
           birdsLists.get(i).eat();

       }


    }






    }

