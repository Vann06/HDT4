

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import org.junit.Before;

public class DLListTest {

    private DLList<Integer> list;

    @Before
    public void setUp() {
        list = new DLList<>();
    }

    @Test
    public void testAddFirst() {
        list.addFirst(1);
        assertEquals("Adding an element at the beginning should work", Integer.valueOf(1), list.getFirst());
        list.addFirst(2);
        assertEquals("Adding another element at the beginning should make it the new first element", Integer.valueOf(2), list.getFirst());
    }

    @Test
    public void testAddLastAndRemoveFirst() {
        assertTrue("List should be empty initially", list.isEmpty());
        list.addLast(1);
        list.addLast(2);
        assertEquals("First element should be 1", Integer.valueOf(1), list.getFirst());
        list.removeFirst();
        assertEquals("After removing the first, the new first should be 2", Integer.valueOf(2), list.getFirst());
    }

    @Test
    public void testIsEmpty() {
        assertTrue("List should be empty initially", list.isEmpty());
        list.addFirst(1);
        assertFalse("List should not be empty after adding elements", list.isEmpty());
    }
}