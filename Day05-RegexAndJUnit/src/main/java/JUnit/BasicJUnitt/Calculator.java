package JUnit.BasicJUnitt;
//package JUnit.BasicJUnitTest.AdvancePracticeProblems;

public class Calculator {

    // Method to divide two integers
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
