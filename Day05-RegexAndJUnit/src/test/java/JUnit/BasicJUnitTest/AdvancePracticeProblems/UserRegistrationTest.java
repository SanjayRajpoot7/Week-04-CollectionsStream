package JUnit.BasicJUnitTest.AdvancePracticeProblems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

    private JUnit.BasicJUnitTest.AdvancePracticeProblems.UserRegistration userRegistration = new JUnit.BasicJUnitTest.AdvancePracticeProblems.UserRegistration();


    @Test
    public void testValidRegistration() {
        assertDoesNotThrow(() -> userRegistration.registerUser("user123", "user@example.com", "Password1"));
    }

    @Test
    public void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("us", "user@example.com", "Password1"), "Invalid username. It must be at least 3 characters long.");
    }


    @Test
    public void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("user123", "invalid-email", "Password1"), "Invalid email address.");
    }


    @Test
    public void testInvalidPasswordLength() {
        assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("user123", "user@example.com", "Pass1"), "Invalid password. It must be at least 8 characters long, contain at least one uppercase letter, one lowercase letter, and one digit.");
    }


    @Test
    public void testInvalidPasswordUppercase() {
        assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("user123", "user@example.com", "password1"), "Invalid password. It must be at least 8 characters long, contain at least one uppercase letter, one lowercase letter, and one digit.");
    }

    @Test
    public void testInvalidPasswordDigit() {
        assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("user123", "user@example.com", "Password"), "Invalid password. It must be at least 8 characters long, contain at least one uppercase letter, one lowercase letter, and one digit.");
    }
}
