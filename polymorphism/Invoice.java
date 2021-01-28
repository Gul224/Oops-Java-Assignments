package polymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 * Example of Static Polymorphism or Compile time Polymorphism
 * Using Method Overloading and Operator Overloading
 */
public class Invoice implements BillInfo {
    private List<Integer> bills;
    public Invoice(){
        bills = new ArrayList<>();
    }

    void addBill(int amount){
        bills.add(amount);

    }
    void addBill(int amount, float discount){
        bills.add(Math.round(amount*discount));

    }

    @Override
    public void printTotal(){
        int sum = 0;
        for (int i = 0;  i<bills.size(); i++){
            sum = sum+ bills.get(i); // + is doing the addition
        }
        System.out.println("Total Amount: " + sum); // + is doing concatenation
    }
}
