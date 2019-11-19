package hw.hw8;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class HumanTest {

    Human family1Mother;
    Human family1Father;
    Human family1Child1;
    Human family1Child2;
    Human family1Child3;
    Human family1Child4;
    Human family1Child5;
    Human family1Child6;
    Human family1Child7;
    Human family1Child8;

    @Before
    public void Before() {
        family1Mother = new Human("Sevinc", "Huseynova", 1967, 80, new HashMap<DayOfWeek, List<String>>(){{put(DayOfWeek.MONDAY, Arrays.asList("go shopping","take care of children"));}});
        family1Father = new Human("Mirze", "Huseynov", 1965, 90);
        family1Child1 = new Human("Rovshan", "Huseynov", 1994);
        family1Child2 = new Human("Sabina", "Huseynova", 1993);
        family1Child3 = new Human("Kamil", "Huseynov", 1997);
        family1Child4 = new Human("Elekber", "Huseynov", 1990, 90, new HashMap<DayOfWeek, List<String>>(){{put(DayOfWeek.MONDAY, Arrays.asList("do homework")); put(DayOfWeek.SUNDAY, Arrays.asList("have a rest"));}});
        family1Child5 = new Human("Ramin", "Huseynov", 1980, 80, new HashMap<DayOfWeek, List<String>>(){{put(DayOfWeek.MONDAY, Arrays.asList("do homework")); put(DayOfWeek.SUNDAY, Arrays.asList("have a rest"));}});
        family1Child6 = new Human("Ramin", "Huseynov", 1980, 80, new HashMap<DayOfWeek, List<String>>(){{put(DayOfWeek.MONDAY, Arrays.asList("do homework")); put(DayOfWeek.SUNDAY, Arrays.asList("have a rest"));}});
        family1Child7 = new Human("Ramin", "Huseynov", 1980, 80, new HashMap<DayOfWeek, List<String>>(){{put(DayOfWeek.MONDAY, Arrays.asList("do homework")); put(DayOfWeek.TUESDAY, Arrays.asList("read books")); put(DayOfWeek.SUNDAY, Arrays.asList("have a rest"));}});
        family1Child8 = new Human("Ramin", "Huseynov", 1980, 80, new HashMap<DayOfWeek, List<String>>(){{put(DayOfWeek.MONDAY, Arrays.asList("sleep")); put(DayOfWeek.TUESDAY, Arrays.asList("read books")); put(DayOfWeek.SUNDAY, Arrays.asList("have a rest"));}});
    }

    @After
    public void After() {
        System.out.println("Testing Finished");
    }

    @Test
    public void testEquals1() {
        assertEquals(false, family1Mother.equals(family1Father));
    }

    @Test
    public void testEquals2() {
        assertEquals(false, family1Child4.equals(family1Child5));
    }

    @Test
    public void testEquals3() {
        assertEquals(false, family1Child4.equals(family1Child5));
    }

    @Test
    public void testEquals4() {
        assertEquals(true, family1Child5.equals(family1Child6));
    }

    @Test
    public void testEquals5() {
        assertEquals(false, family1Child6.equals(family1Child7));
    }

    @Test
    public void testEquals6() {
        assertEquals(false, family1Child7.equals(family1Child8));
    }

    @Test
    public void testHashCode1() {
        assertEquals(false, family1Child1.hashCode() == family1Child2.hashCode());
    }

    @Test
    public void testHashCode2() {
        assertEquals(true, family1Child5.hashCode() == family1Child6.hashCode());
    }

}