package hw.hw8;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.*;

public class FamilyTest {

    Human family1Mother;
    Human family1Father;
    Human family1Child1;
    Human family1Child2;
    Human family1Child3;
    Human family1Child4;
    Dog myDog1;
    DomesticCat myCat1;
    Dog myDog2;
    Family f1;
    Main main;

    @Before
    public void Before() {
        family1Mother = new Human("Sevinc", "Huseynova", 1967, 80, new HashMap<DayOfWeek, List<String>>() {{ put(DayOfWeek.MONDAY, Arrays.asList("go shopping", "take care of children")); }});
        family1Father = new Human("Mirze", "Huseynov", 1965, 90);
        family1Child1 = new Human("Rovshan", "Huseynov", 1994);
        family1Child2 = new Human("Sabina", "Huseynova", 1993);
        family1Child3 = new Human("Kamil", "Huseynov", 1997);
        family1Child4 = new Human("Elekber", "Huseynov", 1990, 90, new HashMap<DayOfWeek, List<String>>() {{ put(DayOfWeek.MONDAY, Arrays.asList("do homework")); put(DayOfWeek.SUNDAY, Arrays.asList("have a rest")); }});
        myDog1 = new Dog(Species.DOG, "Ares");
        myCat1 = new DomesticCat(Species.DOMESTIC_CAT, "Luna", 2, 30, new HashSet<>(Arrays.asList("jump", "lick", "sleep")));
        myDog2 = new Dog(Species.DOG, "Zeus", 3, 20, new HashSet<>(Arrays.asList("bark", "run fast", "smell well")));
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
    public void countFamily1() {
        assertEquals(4, f1.countFamily());
    }

    @Test
    public void addChild1() {
        int previous = f1.getChildren().size();
        f1.addChild(family1Child3);
        assertSame(previous + 1, f1.getChildren().size());
    }

    @Test
    public void deleteChild1() {
        assertEquals("Child was found and deleted!", main.deleteChildMessage(f1.deleteChild(family1Child1)));
    }

    @Test
    public void deleteChild2() {
        assertEquals("This child does not belong to this family!", main.deleteChildMessage(f1.deleteChild(family1Child4)));
    }

    @Test
    public void deleteChild3() {
        assertEquals("Child was found and deleted!", main.deleteChildMessage(f1.deleteChild(0)));
    }

    @Test
    public void deleteChild4() {
        assertEquals("This child does not belong to this family!", main.deleteChildMessage(f1.deleteChild(5)));
    }

    @Test
    public void addPet() {
        f1.addPet(myCat1);
        f1.addPet(myDog1);
        f1.addPet(myDog2);
        assertEquals(3, f1.getPet().size());
    }
}