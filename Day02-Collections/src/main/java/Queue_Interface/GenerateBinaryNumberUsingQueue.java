package Queue_Interface;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumberUsingQueue {
    // Method to generate first N binary numbers
    public static void generateBinaryNumbers(int N) {
        // Loop through numbers 1 to N
        for (int i = 1; i <= N; i++) {
            // Convert integer to binary string and print it
            System.out.print(Integer.toBinaryString(i) + " ");
        }
    }

    public static void main(String[] args) {
        // Test the function with N=5
        int N = 5;
        generateBinaryNumbers(N);
    }
}
