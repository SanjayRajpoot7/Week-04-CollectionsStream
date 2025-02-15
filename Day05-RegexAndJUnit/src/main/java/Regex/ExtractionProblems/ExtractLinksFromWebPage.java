package Regex.AdvancedProblems.ExtractionProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinksFromWebPage {
    public static void extractLinks(){
        String text =  "Visit https://www.google.com and http://example.org for more info.";

        String regex = "https?://[a-z.]+(?:[a-z])";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }

    public static void main(String[] args) {
       extractLinks();
    }
}
