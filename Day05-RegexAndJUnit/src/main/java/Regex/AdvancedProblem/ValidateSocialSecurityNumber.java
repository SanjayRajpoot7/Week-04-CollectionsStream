package Regex.AdvancedProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSocialSecurityNumber {
    public static void validateSSN(String text){
        String regex = "[0-9]{3}+-[0-9]{2}+-[0-9]{4}";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.group());
        }

    }
    public static void main(String[] args) {
        String text = "My SSN is 123-45-6789 253-45-6729 563-85-5489 113-5-69 98-34-1232 34-765-43.";
        validateSSN(text);
    }
}
