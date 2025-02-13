package BufferedStreams;

import java.io.*;

public class EfficientFileCopy {

    public static void main(String[] args) {
        String source = "D:\\capgeminiTraining\\week-04-collections,streams\\Day03-JavaStreams\\src\\main\\java\\BufferedStreams\\FileData.txt";
        String destinationBuffered = "D:\\capgeminiTraining\\week-04-collections,streams\\Day03-JavaStreams\\src\\main\\java\\BufferedStreams\\StoredFileData.txt";
        String destinationUnbuffered = "path/to/your/destination-unbuffered.txt";


        long bufferedTime = copyWithBufferedStreams(source, destinationBuffered);
        System.out.println("Buffered Streams Copy Time: " + bufferedTime + " nanoseconds");


        long unbufferedTime = copyWithUnbufferedStreams(source, destinationUnbuffered);
        System.out.println("Unbuffered Streams Copy Time: " + unbufferedTime + " nanoseconds");

        System.out.println("\nPerformance Comparison:");
        System.out.println("Buffered Streams are " + (double) unbufferedTime / bufferedTime + " times faster than Unbuffered Streams.");
    }

    public static long copyWithBufferedStreams(String source, String destination) {
        long startTime = System.nanoTime();

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destination))) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        return endTime - startTime/1000000;
    }

    public static long copyWithUnbufferedStreams(String source, String destination) {
        long startTime = System.nanoTime();

        try (FileInputStream fileInputStream = new FileInputStream(source);
             FileOutputStream fileOutputStream = new FileOutputStream(destination)) {

            int byteRead;
            while ((byteRead = fileInputStream.read()) != -1) {
                fileOutputStream.write(byteRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        return endTime - startTime/1000000;
    }
}
