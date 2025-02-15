package JUnit.BasicJUnitTest.AdvancePracticeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    private TemperatureConverter converter;

    // Before each test, create a new instance of TemperatureConverter
    @BeforeEach
    public void setUp() {
        converter = new TemperatureConverter();
    }

    // Test Celsius to Fahrenheit conversion
    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0), "0°C should be 32°F");
        assertEquals(212.0, converter.celsiusToFahrenheit(100), "100°C should be 212°F");
        assertEquals(98.6, converter.celsiusToFahrenheit(37), "37°C should be 98.6°F");
    }

    // Test Fahrenheit to Celsius conversion
    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32), "32°F should be 0°C");
        assertEquals(100.0, converter.fahrenheitToCelsius(212), "212°F should be 100°C");
        assertEquals(37.0, converter.fahrenheitToCelsius(98.6), "98.6°F should be 37°C");
    }
}
