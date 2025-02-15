package Regex.AdvancedProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCardNumber {
    public static void main(String[] args) {
        String text = "4111 1111 1111 1211, 4500 0000 0000 0000, 5105 1051 0510 5100, 5401 2345 6789 0123, 5321 1234 5678 9101, 4929 4872 0204 6843";

        // Regex to validate Visa and MasterCard numbers, allowing spaces
        String regex = "(\\d{4}[\\s-]?){3}\\d{4}";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            // Extract the valid card number and remove spaces for checking
            String cardNumber = matcher.group().replaceAll("[\\s-]", "");
            // Now validate using the updated card number regex
            if (cardNumber.matches("^(4\\d{12}(?:\\d{3})?|5[1-5]\\d{14}|22[2-9]\\d{12}|2[3-6]\\d{13}|27[01]\\d{12}|2720\\d{12})$")) {
                System.out.println(matcher.group());
            }
        }
    }
}
