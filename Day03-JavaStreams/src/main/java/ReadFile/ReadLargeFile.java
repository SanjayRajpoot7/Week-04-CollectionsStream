package ReadFile;

import java.io.*;
import java.util.regex.*;

public class ReadLargeFile {

    public static void main(String[] args) {
        String filePath = "D:\\capgeminiTraining\\week-04-collections,streams\\Day03-JavaStreams\\src\\main\\java\\ReadFile\\DataFile.txt";  // Path to your large file

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Regex pattern for "error" case-insensitive match
            Pattern pattern = Pattern.compile("error", Pattern.CASE_INSENSITIVE);

            while ((line = reader.readLine()) != null) {
                if (pattern.matcher(line).find()) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

