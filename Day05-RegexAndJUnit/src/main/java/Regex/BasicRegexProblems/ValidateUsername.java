package Regex.AdvancedProblems.BasicRegexProblems;
import java.util.regex.*;

public class ValidateUsername {
    public static void main(String[] args) {

        String regex = "^[a-zA-Z0-9_]{5,15}";
        String[] username = {"user_123","user@123","sanjay$raj7","7sanju","Jay45","Raj90jayveer@gmail"};

        Pattern pattern = Pattern.compile(regex);

        for(String userName : username){
            Matcher matcher = pattern.matcher(userName);

            System.out.println(userName+" is valid "+matcher.matches());
        }

    }
}
