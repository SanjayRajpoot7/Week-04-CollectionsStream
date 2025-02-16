package UncheckedException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RuntimeException {
    public static void checkRuntime(int a, int b){
      try{
          int result = a / b;
          System.out.println("Result: "+result);
      }
      catch(ArithmeticException e){
          System.out.println(e.getMessage());
      }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 0;

        try {
            System.out.println("Enter first number: ");
            firstNumber = sc.nextInt();
            System.out.println("Enter second number: ");
            secondNumber = sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("May be input is not correct!");
            return;
        }
         checkRuntime(firstNumber,secondNumber);
    }
}
