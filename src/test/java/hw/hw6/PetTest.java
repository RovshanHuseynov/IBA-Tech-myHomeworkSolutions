package hw.hw6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {

    @Before
    public void before999() {
    }

    @After
    public void after888() {

    }

    @Test
    public void testEquals1() {
        Pet p1 = new Pet(Species.CAT, "Luna", 2, 30, new String[]{"jump", "lick", "sleep"});
        Pet p2 = new Pet(Species.CAT, "Luna", 2, 30, new String[]{"jump", "lick", "sleep"});
        assertEquals(true, p1.equals(p2));
    }

    @Test
    public void testEqual2() {
        Pet p1 = new Pet(Species.CAT, "Luna", 2, 30, new String[]{"jump", "lick", "sleep"});
        Pet p2 = new Pet(Species.DOG, "Zeus", 3, 20, new String[]{"bark", "run fast", "smell well"});
        assertEquals(false, p1.equals(p2));
    }

    @Test
    public void testHashCode1() {
        Pet p1 = new Pet(Species.CAT, "Luna", 2, 30, new String[]{"jump", "lick", "sleep"});
        Pet p2 = new Pet(Species.CAT, "Luna", 2, 30, new String[]{"jump", "lick", "sleep"});
        assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    public void testHashCode2() {
        Pet p1 = new Pet(Species.CAT, "Luna", 2, 30, new String[]{"jump", "lick", "sleep"});
        Pet p2 = new Pet(Species.DOG, "Zeus", 3, 20, new String[]{"bark", "run fast", "smell well"});
        assertNotEquals(p1.hashCode(), p2.hashCode());
    }
}