package Queue_Interface;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {

    // Two queues to implement the stack
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    // Constructor
    ImplementStackUsingQueue() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // Push operation: Add an element to the stack
    public void push(int a) {
        queue1.offer(a); // Add element to queue1
    }

    // Pop operation: Remove the top element from the stack
    public int pop() {
        // Move all elements except the last one to queue2
        while (queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }

        // The last element in queue1 is the top of the stack
        int topElement = queue1.poll();

        // Swap the queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    // Peek operation: Get the top element without removing it
    public int peek() {
        // Move all elements except the last one to queue2
        while (queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }

        // The last element in queue1 is the top of the stack
        int topElement = queue1.peek();

        // Add the element back to queue2
        queue2.offer(queue1.poll());

        // Swap the queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    // Print the entire stack
    public void printStack() {
        Queue<Integer> tempQueue = new LinkedList<>(queue1);  // Copy queue1 to preserve original order

        // Reverse the order to simulate a stack's top-to-bottom view
        while (!tempQueue.isEmpty()) {
            System.out.print(tempQueue.poll() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ImplementStackUsingQueue stack = new ImplementStackUsingQueue();

        // Push elements
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.printStack();  // Output: 1 2 3

        // Peek the top element
        System.out.println("Top element: " + stack.peek());  // Output: 3

        // Pop the top element
        System.out.println("Popped element: " + stack.pop());  // Output: 3

        // Push more elements
        stack.push(56);
        stack.push(67);
        stack.push(775);

        // Peek the top element
        System.out.println("Top element: " + stack.peek());  // Output: 775

        // Pop the top element
        System.out.println("Popped element: " + stack.pop());  // Output: 775

        // Print stack after pop
        stack.printStack();  // Output: 1 2 56 67
    }
}
