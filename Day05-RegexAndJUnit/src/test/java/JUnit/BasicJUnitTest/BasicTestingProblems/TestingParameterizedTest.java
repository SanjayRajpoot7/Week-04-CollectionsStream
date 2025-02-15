//package JUnit.BasicJUnitTest;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;
//import static org.junit.jupiter.api.Assertions.*;
//
//public class TestingParametrizedTest {
//
//    // Test the isEven method with even numbers
//    @ParameterizedTest
//    @ValueSource(ints = {2, 4, 6})  // Testing with even numbers
//    void testIsEvenWithEvenNumbers(int number) {
//        assertTrue(TestingParametrizedTest.isEven(number), "Number should be even: " + number);
//    }
//
//    // Test the isEven method with odd numbers
//    @ParameterizedTest
//    @ValueSource(ints = {7, 9})  // Testing with odd numbers
//    void testIsEvenWithOddNumbers(int number) {
//        assertFalse(TestingParametrizedTest.isEven(number), "Number should be odd: " + number);
//    }
//}
