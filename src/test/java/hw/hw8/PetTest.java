package hw.hw8;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.*;

public class PetTest {

    Dog myDog1;
    Dog myDog2;
    DomesticCat myCat1;

    @Before
    public void Before() {
        myDog1 = new Dog(Species.DOG, "Zeus", 3, 20, new HashSet<>(Arrays.asList("bark", "run fast", "smell well")));
        myDog2 = new Dog(Species.DOG, "Zeus", 3, 20, new HashSet<>(Arrays.asList("bark", "run fast", "smell well")));
        myCat1 = new DomesticCat(Species.DOMESTIC_CAT, "Luna", 2, 30, new HashSet<>(Arrays.asList("jump", "lick", "sleep")));
    }

    @After
    public void After() {
        System.out.println("Testing Finished");
    }

    @Test
    public void testEqualsMyDog1MyDog2() {
        assertEquals(true, myDog1.equals(myDog2));
    }

    @Test
    public void testEqualsMyDog1MyCat1() {
        assertEquals(false, myDog1.equals(myCat1));
    }

    @Test
    public void testHashCodeMyDog1MyDog2() {
        assertEquals(myDog1.hashCode(), myDog2.hashCode());
    }

    @Test
    public void testHashCodeMyDog1MyCat1() {
        assertNotEquals(myDog1.hashCode(), myCat1.hashCode());
    }

    @Test
    public void testGetAgeMyDog2() {
        assertEquals(3, myDog2.getAge());
    }
}