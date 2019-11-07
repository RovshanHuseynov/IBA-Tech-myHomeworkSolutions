package hw.hw6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AbstractPetTest {

    Pet p1;
    Pet p2;
    Pet p3;

    @Before
    public void Before() {
        p1 = new Pet(Species.CAT, "Luna", 2, 30, new String[]{"jump", "lick", "sleep"});
        p2 = new Pet(Species.CAT, "Luna", 2, 30, new String[]{"jump", "lick", "sleep"});
        p3 = new Pet(Species.DOG, "Zeus", 3, 20, new String[]{"bark", "run fast", "smell well"});
    }

    @After
    public void After() {
        System.out.println("Testing Finished");
    }

    @Test
    public void testEquals1() {
        assertEquals(true, p1.equals(p2));
    }

    @Test
    public void testEqual2() {
        assertEquals(false, p1.equals(p3));
    }

    @Test
    public void testHashCode1() {
        assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    public void testHashCode2() {
        assertNotEquals(p1.hashCode(), p3.hashCode());
    }
}