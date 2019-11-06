package hw.hw6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {

    Human h1;
    Human h2;
    Human h3;

    @Before
    public void Before() {
        h1 = new Human("Rovshan", "Huseynov", 1994);
        h2 = new Human("Rovshan", "Huseynov", 1994);
        h3 = new Human("Sabina", "Huseynova", 1993);
    }

    @After
    public void After() {
        System.out.println("Testing Finished");
    }

    @Test
    public void testEquals1() {
        assertEquals(true, h1.equals(h2));
    }

    @Test
    public void testEqual2() {
        assertEquals(false, h1.equals(h3));
    }

    @Test
    public void testHashCode1() {
        assertEquals(h1.hashCode(), h2.hashCode());
    }

    @Test
    public void testHashCode2() {
        assertNotEquals(h1.hashCode(), h3.hashCode());
    }
}