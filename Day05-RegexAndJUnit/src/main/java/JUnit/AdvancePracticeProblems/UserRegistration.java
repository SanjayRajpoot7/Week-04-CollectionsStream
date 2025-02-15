package JUnit.BasicJUnitTest.AdvancePracticeProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    // Method to register a user with username, email, and password
    public void registerUser(String username, String email, String password) {
        if (username == null || username.isEmpty() || username.length() < 3) {
            throw new IllegalArgumentException("Invalid username. It must be at least 3 characters long.");
        }


        // Regex pattern for a valid email
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("Invalid email address.");
        }

        // Password must be at least 8 characters long, contain at least one digit, one uppercase letter, and one lowercase letter
        if (password == null || password.length() < 8 || !password.matches(".*[A-Z].*") || !password.matches(".*[0-9].*") || !password.matches(".*[a-z].*")) {
            throw new IllegalArgumentException("Invalid password. It must be at least 8 characters long, contain at least one uppercase letter, one lowercase letter, and one digit.");
        }
    }
}
