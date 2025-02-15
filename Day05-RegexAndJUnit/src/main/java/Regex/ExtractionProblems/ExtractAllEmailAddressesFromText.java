package Regex.AdvancedProblems.ExtractionProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllEmailAddressesFromText {
    public static void extractEmail(){
        String text = "You can reach me out multiple email support@example.com info@company.org sanju@gmail.com sanjay23@gmail.com";
        String regex = "[a-z]+@[a-z]+\\.[a-z]{2,}";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
    public static void main(String[] args) {
        extractEmail();
    }
}
