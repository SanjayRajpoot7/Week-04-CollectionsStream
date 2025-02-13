package Queue_Interface;

import java.util.*;

public class ReverseQueueElements {
    public static void reverseQueue(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < 5; i++){
            queue.add(i+1);
        }
        System.out.println(queue);
        for(int i = 0; i < 5; i++){
            stack.push(queue.poll());
        }

        for(int i = 0; i < 5; i++){
            queue.add(stack.pop());
        }
        System.out.println(queue);

    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        reverseQueue(queue);
    }
}
