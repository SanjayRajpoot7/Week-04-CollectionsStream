package Regex.AdvancedProblems;

import java.util.*;
import java.util.regex.*;

public class FindRepeatingWordsInSentence {


        public static Set<String> findRepeatingWords(String sentence) {
            Set<String> repeatingWords = new HashSet<>();

            String regex = "\\b(\\w+)\\b";
            Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

            Matcher matcher = pattern.matcher(sentence);
            Map<String, Integer> wordCount = new HashMap<>();

            while (matcher.find()) {
                String word = matcher.group(1).toLowerCase();
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }

            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                if (entry.getValue() > 1) {
                    repeatingWords.add(entry.getKey());
                }
            }

            return repeatingWords;
        }


        public static void main(String[] args) {
            String sentence = "This is is a repeated repeated word test.";
            Set<String> repeatingWords = findRepeatingWords(sentence);

            System.out.println("Repeating words: " + String.join(", ", repeatingWords));
        }
    }
