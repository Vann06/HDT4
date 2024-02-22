import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.junit.Before;


public class VectorStackTest {

    private VectorStack<Integer> stack;

    @Before
    public void setUp() {
        stack = new VectorStack<>();
    }

    @Test
    public void testPushAndIsEmpty() {
        assertTrue("Stack should be empty initially", stack.isEmpty());
        stack.push(1);
        assertFalse("Stack should not be empty after push", stack.isEmpty());
    }

    @Test
    public void testPop() {
        stack.push(2);
        assertEquals("Pop should return the last pushed item", Integer.valueOf(2), stack.pop());
        assertTrue("Stack should be empty after popping the only item", stack.isEmpty());
    }

    @Test
    public void testPeek() {
        stack.push(3);
        assertEquals("Peek should return the last pushed item without removing it", Integer.valueOf(3), stack.peek());
        assertFalse("Stack should not be empty after peek", stack.isEmpty());
    }
}