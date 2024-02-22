import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SLListTest {

    private SLList<Integer> list;

    @Before
    public void setUp() {
        list = new SLList<>();
    }

    @Test
    public void testAddLastAndGetFirst() {
        assertTrue("List should be empty initially", list.isEmpty());
        list.addLast(1);
        assertEquals("getFirst should return the first element added", Integer.valueOf(1), list.getFirst());
        list.addLast(2);
        assertEquals("getFirst should still return the first element after adding another", Integer.valueOf(1), list.getFirst());
    }

    @Test
    public void testRemoveFirst() {
        list.addLast(1);
        list.addLast(2);
        list.removeFirst();
        assertEquals("After removing the first element, getFirst should return the second element added", Integer.valueOf(2), list.getFirst());
        list.removeFirst();
        assertTrue("List should be empty after removing all elements", list.isEmpty());
    }

}