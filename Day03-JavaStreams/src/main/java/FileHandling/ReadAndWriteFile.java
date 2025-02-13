package FileHandling;
import java.io.*;

public class ReadAndWriteFile {

    public static void main(String[] args) {
        // Specify the source and destination file paths
        String sourceFile = "D:\\capgeminiTraining\\week-04-collections,streams\\Day03-JavaStreams\\src\\main\\java\\FileHandling\\dataFile.txt";
        String destinationFile = "D:\\capgeminiTraining\\week-04-collections,streams\\Day03-JavaStreams\\src\\main\\java\\FileHandling\\dataStoredFile.txt";

        // Call the method to copy contents from source file to destination file
        copyFile(sourceFile, destinationFile);
    }

    public static void copyFile(String sourceFile, String destinationFile) {
        // Declare FileInputStream and FileOutputStream
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // Create FileInputStream to read from source file
            fis = new FileInputStream(sourceFile);

            // Check if source file exists
            File source = new File(sourceFile);
            if (!source.exists()) {
                System.out.println("Source file does not exist.");
                return;
            }

            // Create FileOutputStream to write to destination file
            fos = new FileOutputStream(destinationFile);

            // Reading and writing byte by byte
            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                fos.write(byteRead);
            }

            System.out.println("File copied successfully from " + sourceFile + " to " + destinationFile);

        } catch (IOException e) {
            // Handle IOException
            System.out.println("An error occurred while handling the file: " + e.getMessage());
        }
    }
}
