package FilterStream;

import java.io.*;

public class ConvertUpperCaseToLowerCase {

    // Method to read the content of the file, convert to lowercase and write to another file
    public static void convertFileContent(String inputFilePath, String outputFilePath) {
        try (
                // BufferedReader to read the file efficiently
                BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
                // BufferedWriter to write to the file efficiently
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))
        ) {
            String line;

            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                // Convert the line to lowercase
                String lowerCaseLine = line.toLowerCase();

                // Write the converted line to the output file
                writer.write(lowerCaseLine);
                writer.newLine(); // To preserve the line breaks in the file
            }

            System.out.println("File has been converted successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        String inputFilePath = "D:\\capgeminiTraining\\week-04-collections,streams\\Day03-JavaStreams\\src\\main\\java\\FilterStream\\input.txt";
        String outputFilePath = "D:\\capgeminiTraining\\week-04-collections,streams\\Day03-JavaStreams\\src\\main\\java\\FilterStream\\Output.txt";


        convertFileContent(inputFilePath, outputFilePath);
    }
}

