package Queue_Interface;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class ReverseQueueElementsTest {
    @Test
    public void reverseQueue() {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            queue.add(i + 1);
        }
        System.out.println(queue);
        for (int i = 0; i < 5; i++) {
            stack.push(queue.poll());
        }

        for (int i = 0; i < 5; i++) {
            queue.add(stack.pop());
        }
        System.out.println(queue);
        assertEquals("[5, 4, 3, 2, 1]", queue.toString());


    }

}