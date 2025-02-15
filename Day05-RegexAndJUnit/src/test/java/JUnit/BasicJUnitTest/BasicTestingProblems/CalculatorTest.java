package JUnit.BasicJUnitTest;//package JUnit.BasicJUnitTest.AdvancePracticeProblems;

import JUnit.BasicJUnitt.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    // Test case to verify that ArithmeticException is thrown when dividing by zero
    @Test
    public void testDivideByZero() {
        // Test that an exception is thrown when dividing by zero
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0), "Cannot divide by zero");
    }

    // Test case to verify normal division
    @Test
    public void testDivideNormal() {
        // Test normal division (e.g., 10 divided by 2)
        assertEquals(5, calculator.divide(10, 2), "10 divided by 2 should be 5");
    }
}
