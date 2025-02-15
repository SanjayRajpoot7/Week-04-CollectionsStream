package JUnit.BasicJUnitt;
import java.io.*;
import java.nio.file.*;

    public class FileProcessor {

        // Method to write content to a file
        public void writeToFile(String filename, String content) throws IOException {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                writer.write(content);
            }
        }

        // Method to read content from a file
        public String readFromFile(String filename) throws IOException {
            Path filePath = Paths.get(filename);
            return new String(Files.readAllBytes(filePath));
        }

        // Method to check if the file exists
        public boolean fileExists(String filename) {
            return Files.exists(Paths.get(filename));
        }

        // Main method to test the file operations
        public static void main(String[] args) {
            // Create an instance of FileProcessor
            FileProcessor fileProcessor = new FileProcessor();

            // Test writing to a file
            String filename = "D:\\capgeminiTraining\\week-04-collections,streams\\Day05-RegexAndJUnit\\src\\main\\java\\JUnit\\BasicJUnitTest\\NormalFile.txt";

            String content = "Hello, this is a test content!";
            try {
                fileProcessor.writeToFile(filename, content);
                System.out.println("Content written to file: " + filename);

                // Verify the file exists after writing
                if (fileProcessor.fileExists(filename)) {
                    System.out.println("File exists: " + filename);
                } else {
                    System.out.println("File does not exist.");
                }

                // Read content from the file
                String fileContent = fileProcessor.readFromFile(filename);
                System.out.println("Content read from file: " + fileContent);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


//    String content = "Hello world! How is going.";

