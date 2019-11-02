package hw.hw6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {

    @Before
    public void before999() {
    }

    @After
    public void after888() {

    }

    @Test
    public void testEquals1() {
        Human h1 = new Human("Rovshan", "Huseynov", 1994);
        Human h2 = new Human("Rovshan", "Huseynov", 1994);
        assertEquals(true, h1.equals(h2));
    }

    @Test
    public void testEqual2() {
        Human h1 = new Human("Rovshan", "Huseynov", 1994);
        Human h2 = new Human("Sabina", "Huseynova", 1993);
        assertEquals(false, h1.equals(h2));
    }

    @Test
    public void testHashCode1() {
        Human h1 = new Human("Rovshan", "Huseynov", 1994);
        Human h2 = new Human("Rovshan", "Huseynov", 1994);
        assertEquals(h1.hashCode(), h2.hashCode());
    }

    @Test
    public void testHashCode2() {
        Human h1 = new Human("Rovshan", "Huseynov", 1994);
        Human h2 = new Human("Sabina", "Huseynova", 1993);
        assertNotEquals(h1.hashCode(), h2.hashCode());
    }
}