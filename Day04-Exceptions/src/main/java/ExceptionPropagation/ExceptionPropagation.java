package ExceptionPropagation;

import java.util.Scanner;

public class ExceptionPropagation {
    public static int checkException(int first, int second){
       int value = first / second;
       return value;
    }
    public static void anotherMethod(int first, int second){
        System.out.println(checkException(first,second));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second Number: ");
        int secondNumber = scanner.nextInt();

//        anotherMethod(firstNumber, secondNumber);

        try{
            anotherMethod(firstNumber, secondNumber);
        }
        catch (ArithmeticException e){
            System.out.println("Handled exception in main");
            System.out.println(e.getMessage());
        }

    }
}
