package Regex.AdvancedProblems.BasicRegexProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLicensePlateNumber {
    public static void main(String[] args) {
        String regex = "^[A-Z]{2}\\d{4}$";

        String[] numberPlate = {"MP4967", "HP34","RJH6789","GJ9342","76GH98"};

        Pattern pattern = Pattern.compile(regex);

        for(String nPlate : numberPlate) {
            Matcher matcher = pattern.matcher(nPlate);
            System.out.println(nPlate+" is valid "+matcher.matches());
        }
    }
}
