package ByteArrayStream;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ImageByteArrayConversion {

    // Method to convert an image file into a byte array
    public static byte[] convertImageToByteArray(String imagePath) {
        try (FileInputStream fileInputStream = new FileInputStream(imagePath);
             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read the image file and write to ByteArrayOutputStream
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                byteArrayOutputStream.write(buffer, 0, bytesRead);
            }

            // Return the byte array
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Method to write the byte array back to a new image file
    public static void writeByteArrayToImage(byte[] byteArray, String newImagePath) {
        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
             FileOutputStream fileOutputStream = new FileOutputStream(newImagePath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read the byte array and write to the new image file
            while ((bytesRead = byteArrayInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to compare the original image file with the new image file
    public static boolean compareImages(String originalImagePath, String newImagePath) {
        try {
            // Read the byte arrays of both the original and new image files
            byte[] originalImage = Files.readAllBytes(Paths.get(originalImagePath));
            byte[] newImage = Files.readAllBytes(Paths.get(newImagePath));

            // Compare the byte arrays
            return java.util.Arrays.equals(originalImage, newImage);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        String originalImagePath = "D:\\capgeminiTraining\\week-04-collections,streams\\Day03-JavaStreams\\src\\main\\java\\ByteArrayStream\\pexels-pixabay-40784.jpg";
        String newImagePath = "D:\\capgeminiTraining\\week-04-collections,streams\\Day03-JavaStreams\\src\\main\\java\\ByteArrayStream\\NewFile.jpg";

        // Convert original image to byte array
        byte[] imageByteArray = convertImageToByteArray(originalImagePath);

        // Write the byte array back to a new image file
        if (imageByteArray != null) {
            writeByteArrayToImage(imageByteArray, newImagePath);
            System.out.println("Image has been written to the new file.");
        }

        // Compare the original and the new image files to ensure they are identical
        if (compareImages(originalImagePath, newImagePath)) {
            System.out.println("The original image and the new image are identical.");
        } else {
            System.out.println("The original image and the new image are not identical.");
        }
    }
}
