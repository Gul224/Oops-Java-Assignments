package constructorwithmultipleparam;

public class Student {
    // Constructor Overloading, trying to use constructor with one or more than one argument
    Student(String name){
        //constructor with one arg
        System.out.println("one param : " + name);

    }
    // 2 arguments
    Student(String name, int age){
        System.out.println("two param : " + "String and Integer : " + name + " " + age);
    }

    // one arg but long
    Student(long id){
        System.out.println("one param : " + "Long : " +  id);
    }
}
