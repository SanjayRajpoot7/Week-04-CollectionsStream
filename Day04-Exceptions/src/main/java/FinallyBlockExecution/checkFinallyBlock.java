package FinallyBlockExecution;

import java.util.Scanner;

public class checkFinallyBlock {

    public static void executionOfFinallyBlock(int first, int second){
        try{
            int result = first / second;
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Operation completed.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second Number: ");
        int secondNumber = scanner.nextInt();

        executionOfFinallyBlock(firstNumber, secondNumber);
    }
}
