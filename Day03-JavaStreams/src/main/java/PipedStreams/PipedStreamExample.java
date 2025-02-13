package PipedStreams;

import java.io.*;
import java.util.concurrent.TimeUnit;

class WriterThread extends Thread {
    private PipedOutputStream pipedOutputStream;

    public WriterThread(PipedOutputStream pipedOutputStream) {
        this.pipedOutputStream = pipedOutputStream;
    }

    @Override
    public void run() {
        String message = "Hello from Writer Thread!";
        try {
            // Write data into the PipedOutputStream
            for (int i = 0; i < message.length(); i++) {
                pipedOutputStream.write(message.charAt(i));
                TimeUnit.MILLISECONDS.sleep(100);  // Simulate delay
            }
            pipedOutputStream.close();
            System.out.println("Writer Thread has finished writing.");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ReaderThread extends Thread {
    private PipedInputStream pipedInputStream;

    public ReaderThread(PipedInputStream pipedInputStream) {
        this.pipedInputStream = pipedInputStream;
    }

    @Override
    public void run() {
        try {
            int data;
            while ((data = pipedInputStream.read()) != -1) {
                System.out.print((char) data);
            }
            pipedInputStream.close();
            System.out.println("\nReader Thread has finished reading.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class PipedStreamExample {

    public static void main(String[] args) {
        try {
            PipedOutputStream pipedOutputStream = new PipedOutputStream();
            PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);

            WriterThread writerThread = new WriterThread(pipedOutputStream);
            ReaderThread readerThread = new ReaderThread(pipedInputStream);

            writerThread.start();
            readerThread.start();

            writerThread.join();
            readerThread.join();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
