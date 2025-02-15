package JUnit.BasicJUnitTest.AdvancePracticeProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static void main(String[] args) {
        String passwordPackage = "Sanjay7raj, Sanj23raj raj77jay Rj22its, karun9fal";

        String regex = "[A-Z]{1,}+[0-9]{8,}$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(passwordPackage);

        while(matcher.find()){
            System.out.print(matcher.group());
        }
    }
}
