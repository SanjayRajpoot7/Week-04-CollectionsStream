package Regex.AdvancedProblems.ExtractionProblems;

import java.util.Arrays;
import java.util.List;

public class CensorBadWordsInSentence {

    public static void main(String[] args) {
        String sentence = "This is a damn bad example with some stupid words.";

        final List<String> badWords = Arrays.asList("damn", "stupid");
        String censoredSentence = sentence;

        for (String badWord : badWords) {
            String pattern = "(?i)\\b" + badWord + "\\b";

            censoredSentence = censoredSentence.replaceAll(pattern, "****");
        }
        System.out.println("Original: " + sentence);
        System.out.println("Censored: " + censoredSentence);
    }
}
