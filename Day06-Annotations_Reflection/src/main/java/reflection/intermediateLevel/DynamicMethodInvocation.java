package reflection.intermediateLevel;

import java.lang.reflect.*;
import java.util.Scanner;

class MathOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class DynamicMethodInvocation {

    public static void invokeMathMethod(String methodName, int a, int b) {
        try {
            MathOperations mathOperations = new MathOperations();

            Class<?> cls = mathOperations.getClass();
            Method method = cls.getDeclaredMethod(methodName, int.class, int.class);

            Object result = method.invoke(mathOperations, a, b);
            System.out.println("Result: " + result);

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter operation (add, subtract, multiply): ");
        String operation = scanner.nextLine().toLowerCase();
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        invokeMathMethod(operation, num1, num2);

        scanner.close();
    }
}

