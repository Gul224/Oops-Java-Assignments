package Strings;

public class StringMethods {
    public static void main(String [] args){
        String name = "Gul Shaik ";
        String description = " is Edddiot";
        System.out.println("Name: " + name);

        //Here we are using String method to convert string into upper case
        // here name. will provide all the methods you can implement in here
        //camel case
        System.out.println("UpperCase: " + name.toUpperCase());
        System.out.println("LowerCase: " + name.toLowerCase());
        System.out.println("First Char:" + name.charAt(0));
        //Concat is nothing but adding
        // Adding same name to same name- using method concat, adds one string to another
        System.out.println("Concat: " + name.concat(name));
        // Adds another string to the end of current string
        System.out.println("Concat: " + name.concat(description));
        System.out.println("Length: " + name.length());
        System.out.println("Substring: "+ name.substring(4,9));
        // replacing old char to new
        System.out.println("replace: " + name.replace(name, description));

    }
}
