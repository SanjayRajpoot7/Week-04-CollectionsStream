package Regex.AdvancedProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIPAdderess {
    public static void main(String[] args) {
        String text = "763.34.2.1 172.16.254.1 192.16.10.5 176.5.2.0 128.0.0.255 255.255.255.0 2534.44.1.2";

        String regex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        String[] ipAddresses = text.split(" ");

        Pattern pattern = Pattern.compile(regex);


        for (String ip : ipAddresses) {
            Matcher matcher = pattern.matcher(ip);
            if (matcher.matches()) {
                System.out.println(ip + " is a valid.");
            } else {
                System.out.println(ip + " is not a valid.");
            }
        }
    }
}
