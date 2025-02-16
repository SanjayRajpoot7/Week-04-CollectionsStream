package reflection.basicLevel;

import java.lang.reflect.*;
import java.util.Scanner;


class Person{

    public String name;
    public int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void displayItemName(){
        System.out.println(name+"\n"+age);
    }

}

public class GetClassInformation {
    public static int age = 22;

    public static void getClassName(String className) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Person person = new Person("Sanjay",22);
        Class<?> cls = person.getClass();
        System.out.println(cls);

        Method method = cls.getDeclaredMethod("displayItemName");
        method.invoke(person);

    }


    public static void main(String[] args) throws ClassNotFoundException {

        Scanner scanner = new Scanner(System.in);

        // Ask the user for the class name to inspect
        System.out.print("Enter the class name (with package, e.g., java.util.ArrayList): ");
        String className = scanner.nextLine();


        try {
            getClassName(className);
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            System.out.println("Class not found: " + className);
        }
        scanner.close();
    }

}
