package Queue_Interface;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ImplementStackUsingQueueTest {
    ImplementStackUsingQueue stack;
    @BeforeEach
    public void setUp() {
        stack = new ImplementStackUsingQueue();
    }

    @Test
    public void testPushAndPopSequence() {
        // Push some elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // After pushing, pop the elements and check their order (LIFO)
        assertEquals(30, stack.pop());
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
    }

    @Test
    public void testPeekOperation() {
        // Push elements
        stack.push(100);
        stack.push(200);
        stack.push(300);

        // Peek should return the last pushed element without removing it
        assertEquals(300, stack.peek());

        // Check if peek operation does not affect the stack
        assertEquals(300, stack.peek(), "Top element should still be 300");
    }

    @Test
    public void testEmptyStackPop() {
        // Initially, the stack is empty
        assertThrows(IllegalStateException.class, () -> stack.pop(), "Pop should throw an exception if the stack is empty");
    }

    @Test
    public void testPushAfterPop() {
        // Push some elements
        stack.push(5);
        stack.push(10);

        // Pop one element
        assertEquals(10, stack.pop(), "Top element should be 10");

        // Push a new element after popping
        stack.push(20);

        // Now the stack should have 5 at the bottom and 20 on top
        assertEquals(20, stack.pop(), "Top element should now be 20");
        assertEquals(5, stack.pop(), "Remaining element should be 5");
    }

    @Test
    public void testStackStateAfterMultipleOperations() {
        // Perform a sequence of push and pop operations
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Pop one element (should be 30)
        stack.pop();

        // Peek the top element (should be 20)
        assertEquals(20, stack.peek(), "Top element should be 20");

        // Pop two more elements (should be 20 and then 10)
        assertEquals(20, stack.pop(), "Top element should be 20");
        assertEquals(10, stack.pop(), "Top element should be 10");

        // Now the stack should be empty
        assertThrows(IllegalStateException.class, () -> stack.pop(), "Pop should throw an exception if the stack is empty");
    }
}
