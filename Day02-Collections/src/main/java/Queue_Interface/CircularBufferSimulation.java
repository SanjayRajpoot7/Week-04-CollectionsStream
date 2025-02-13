package Queue_Interface;

public class CircularBufferSimulation {
    private int[] buffer;
    private int front;
    private int rear;
    private int size;
    private int capacity;  // Capacity of the buffer

    // Constructor to initialize the buffer with a fixed size
    public CircularBufferSimulation(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    // Method to insert an element into the buffer
    public void insert(int value) {
        if (size == capacity) {
            // Buffer is full, so overwrite the oldest element
            front = (front + 1) % capacity;
        } else {
            size++;
        }
        buffer[rear] = value;
        rear = (rear + 1) % capacity;  // Move rear to the next position (circular)
    }

    // Method to display the current elements in the buffer
    public void display() {
        if (size == 0) {
            System.out.println("Buffer is empty.");
            return;
        }

        int current = front;
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[current] + " ");
            current = (current + 1) % capacity;  // Circular behavior
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a circular buffer with a capacity of 3
        CircularBufferSimulation buffer = new CircularBufferSimulation(3);

        // Insert elements
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);

        // Display buffer content
        System.out.print("Buffer after inserting 1, 2, 3: ");
        buffer.display();
    }
}
