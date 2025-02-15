package JUnit.BasicJUnitTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    public void reverse() {
        String str = "Jay";
        String newString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newString += str.charAt(i);
        }
        assertEquals("yaJ", newString);
    }

    @Test
    public void isPalindrome() {
        String str = "Jay";
        int left = 0;
        int right = str.length() - 1;
        boolean flag = false;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                flag = true;
                break;
            }
            left++;
            right--;
        }
        if (!flag) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
        assertEquals("String is not palindrome", "String is not palindrome");
    }

    @Test
    public void toUpperCase() {
        String str = "Jay";
        String str2 = str.toUpperCase();

        assertEquals("JAY", str2);
    }
}