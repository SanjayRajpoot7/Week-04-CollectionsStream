package Regex.AdvancedProblems.BasicRegexProblems;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateHexColorCode {
    public static void validateColorCode(){
        String regex = "^#[0-9, A-F, a-f]{6}$";

        String[] colorCode = {"#FFA500", "#ff4500","#Ef6546", "#Ad6534","##Ff654","#HH87#"};

        Pattern pattern = Pattern.compile(regex);

        for(String cCode : colorCode){
            Matcher matcher = pattern.matcher(cCode);
            System.out.println(cCode+" Is valid "+matcher.matches());
        }
    }
    public static void main(String[] args) {
        validateColorCode();
    }
}
