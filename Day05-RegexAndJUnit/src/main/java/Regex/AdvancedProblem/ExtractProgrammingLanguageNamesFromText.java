package Regex.AdvancedProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguageNamesFromText {
    public static void main(String[] args) {
        List<String> programmingWords = Arrays.asList("Java", "Python", "JavaScript", "Go");

        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        for (String programmingWord : programmingWords) {
            String pattern = "(?i)\\b" + programmingWord + "\\b";

            Pattern pattern1 = Pattern.compile(pattern);
            Matcher matcher = pattern1.matcher(text);
            while(matcher.find()){
                System.out.println(matcher.group());
            }
        }

    }
}
