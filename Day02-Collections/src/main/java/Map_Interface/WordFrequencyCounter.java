package Map_Interface;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

        public static void countWordFrequency(String fileName) throws IOException {
            String filePath = "D:\\capgeminiTraining\\week-04-collections,streams\\Day02-Collections\\src\\main\\java\\Map_Interface\\WordTextFile.txt";
            Map<String, Integer> wordCountMap = new HashMap<>();

            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = br.readLine()) != null) {
                // Normalize the text (convert to lowercase and remove punctuation)
                line = line.toLowerCase().replaceAll("[^a-zA-Z ]", "");

                // Split the line into words based on space
                String[] words = line.split("\\s+");

                // Count each word frequency
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
            System.out.println(wordCountMap);
        }

        public static void main(String[] args) {
            try {

                countWordFrequency("D:\\capgeminiTraining\\week-04-collections,streams\\Day02-Collections\\src\\main\\java\\Map_Interface\\WordTextFile.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
