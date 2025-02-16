package CustomException;
import java.util.Scanner;

public class UserDefined {
    public static void checkValid(int age) throws InvalidAgeException{
        try {
            if (age > 18) {
                System.out.println("Access granted!");
            } else {
                throw new InvalidAgeException("Age must be 18 or above.");
            }
        } catch (InvalidAgeException e) {
            System.out.println("Invalid Age: " + e.getMessage());
        }

    }
    public static void main(String[] args) throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        checkValid(age);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
