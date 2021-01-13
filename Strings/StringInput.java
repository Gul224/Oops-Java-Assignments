package Strings;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args){
        // Input is like user saying to your machine

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter game 1:");
        // we are asking to enter an input in the next line, with scan object
        String game1 = scan.nextLine();

// use with diff variables to define
        System.out.println("Enter game 2:");
        String game2 = scan.nextLine();

        System.out.println("Enter game 3:");
        String game3 = scan.nextLine();

        System.out.println("Enter game 4:");
        String game4 = scan.nextLine();

        System.out.println("Enter game 5:");
        String game5 = scan.nextLine();

        System.out.println("Enter game 6:");
        String game6 = scan.nextLine();


       System.out.println("Here is your game");
        System.out.println(game1);
        System.out.println(game2);
        System.out.println(game3);
        System.out.println(game4);
        System.out.println(game5);
        System.out.println(game6);
    }
}
