package hw.hw6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class FamilyTest {

    Human family1Mother;
    Human family1Father;
    Human family1Child1;
    Human family1Child2;
    Human family1Child3;
    Human family1Child4;
    Family f1;
    Main main;

    @Before
    public void Before() {
        family1Mother = new Human("Sevinc", "Huseynova", 1967, 80, new String[][]{{DayOfWeek.MONDAY.name(), "go shopping"}});
        family1Father = new Human("Mirze", "Huseynov", 1965, 90);
        family1Child1 = new Human("Rovshan", "Huseynov", 1994);
        family1Child2 = new Human("Sabina", "Huseynova", 1993);
        family1Child3 = new Human("Kamil", "Huseynov", 1997);
        family1Child4 = new Human("Elekber", "Huseynov", 1990, 90, new String[][]{{DayOfWeek.MONDAY.name(), "do homework"}, {DayOfWeek.SUNDAY.name(), "have a rest"}});
        f1 = new Family(family1Mother, family1Father);
        f1.addChild(family1Child1);
        f1.addChild(family1Child2);
        main = new Main();
    }

    @After
    public void After() {
        System.out.println("Testing Finished");
    }

    @Test
    public void countFamily() {   // countFamily() works or not
        assertEquals(4, f1.countFamily());
    }

    @Test
    public void addChild() {   // after addChild method getCountChildren() is increased by 1 or not
        int previous = f1.getCountChildren();
        f1.addChild(family1Child3);
        assertSame(previous + 1, f1.getCountChildren());
    }

    @Test
    public void deleteChild1() {    // delete Human child who exists in children array
        assertEquals("Child was found and deleted!", main.deleteChildMessage(f1.deleteChild(family1Child1)));
    }

    @Test
    public void deleteChild2() {   // delete Human child who does not exist in children array
        assertEquals("This child does not belong to this family!", main.deleteChildMessage(f1.deleteChild(family1Child4)));
    }

    @Test
    public void deleteChild3() {   // delete children[index] which this index is less than children length
        assertEquals("Child was found and deleted!", main.deleteChildMessage(f1.deleteChild(0)));
    }

    @Test
    public void deleteChild4() {   // delete children[index] which this index is bigger than children length
        assertEquals("This child does not belong to this family!", main.deleteChildMessage(f1.deleteChild(5)));
    }
}