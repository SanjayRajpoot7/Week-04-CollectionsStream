package Regex.AdvancedProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrencyValuesFromText {

    public static void extractCurrencyValue(String text){

        String regex = "$?[$0-9.]+";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50";
        extractCurrencyValue(text);
    }
}
