package hw.hw8;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.*;

public class AbstractPetTest {

    Dog myDog1;
    Dog myDog2;
    DomesticCat myCat1;

    @Before
    public void Before() {
        myDog1 = new Dog(Species.DOG, "Zeus", 3, 20, new HashSet<>(Arrays.asList("bark", "run fast", "smell well")));
        myDog2 = new Dog(Species.DOG, "Zeus", 3, 20, new HashSet<>(Arrays.asList("bark", "run fast", "smell well")));
        myCat1 = new DomesticCat(Species.DOMESTICCAT, "Luna", 2, 30, new HashSet<>(Arrays.asList("jump", "lick", "sleep")));
    }

    @After
    public void After() {
        System.out.println("Testing Finished");
    }

    @Test
    public void testEquals1() {
        assertEquals(true, myDog1.equals(myDog2));
    }

    @Test
    public void testEqual2() {
        assertEquals(false, myDog1.equals(myCat1));
    }

    @Test
    public void testHashCode1() {
        assertEquals(myDog1.hashCode(), myDog2.hashCode());
    }

    @Test
    public void testHashCode2() {
        assertNotEquals(myDog1.hashCode(), myCat1.hashCode());
    }

    @Test
    public void testGetAge1() {
        assertEquals(3, myDog2.getAge());
    }
}