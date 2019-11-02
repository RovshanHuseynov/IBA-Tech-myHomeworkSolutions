package hw.hw6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class FamilyTest {

    @Before
    public void before999() {
    }

    @After
    public void after888() {

    }

    @Test
    public void countFamily() {   // countFamily() works or not
        Human family1Mother = new Human("Sevinc", "Huseynova", 1967, 80, new String[][]{{DayOfWeek.MONDAY.name(), "go shopping"}});
        Human family1Father = new Human("Mirze", "Huseynov", 1965, 90);
        Human family1Child1 = new Human("Rovshan", "Huseynov", 1994);
        Human family1Child2 = new Human("Sabina", "Huseynova", 1993);
        Human family1Child3 = new Human("Kamil", "Huseynov", 1997);
        Family f1 = new Family(family1Mother, family1Father);
        f1.addChild(family1Child1);
        f1.addChild(family1Child2);
        f1.addChild(family1Child3);
        assertEquals(5, f1.countFamily());
    }

    @Test
    public void addChild() {   // after addChild method getCountChildren() is increased by 1 or not
        Human family1Mother = new Human("Sevinc", "Huseynova", 1967, 80, new String[][]{{DayOfWeek.MONDAY.name(), "go shopping"}});
        Human family1Father = new Human("Mirze", "Huseynov", 1965, 90);
        Human family1Child1 = new Human("Rovshan", "Huseynov", 1994);
        Human family1Child2 = new Human("Sabina", "Huseynova", 1993);
        Human family1Child3 = new Human("Kamil", "Huseynov", 1997);
        Family f1 = new Family(family1Mother, family1Father);
        f1.addChild(family1Child1);
        f1.addChild(family1Child2);
        int previous = f1.getCountChildren();
        f1.addChild(family1Child3);
        assertSame(previous + 1, f1.getCountChildren());
    }

    @Test
    public void deleteChild1() {    // delete Human child who exists in children array
        Human family1Mother = new Human("Sevinc", "Huseynova", 1967, 80, new String[][]{{DayOfWeek.MONDAY.name(), "go shopping"}});
        Human family1Father = new Human("Mirze", "Huseynov", 1965, 90);
        Human family1Child1 = new Human("Rovshan", "Huseynov", 1994);
        Human family1Child2 = new Human("Sabina", "Huseynova", 1993);
        Human family1Child3 = new Human("Kamil", "Huseynov", 1997);
        Family f1 = new Family(family1Mother, family1Father);
        f1.addChild(family1Child1);
        f1.addChild(family1Child2);
        f1.addChild(family1Child3);
        int x = f1.deleteChild(family1Child3);
        Main main = new Main();
        assertEquals("Child was found and deleted.", main.deleteChildMessage(x));
    }

    @Test
    public void deleteChild2() {   // delete Human child who does not exist in children array
        Human family1Mother = new Human("Sevinc", "Huseynova", 1967, 80, new String[][]{{DayOfWeek.MONDAY.name(), "go shopping"}});
        Human family1Father = new Human("Mirze", "Huseynov", 1965, 90);
        Human family1Child1 = new Human("Rovshan", "Huseynov", 1994);
        Human family1Child2 = new Human("Sabina", "Huseynova", 1993);
        Human family1Child3 = new Human("Kamil", "Huseynov", 1997);
        Human family1Child4 = new Human("Elekber", "Huseynov", 1990, 90, new String[][]{{DayOfWeek.MONDAY.name(), "do homework"}, {DayOfWeek.SUNDAY.name(), "have a rest"}});
        Family f1 = new Family(family1Mother, family1Father);
        f1.addChild(family1Child1);
        f1.addChild(family1Child2);
        f1.addChild(family1Child3);
        int x = f1.deleteChild(family1Child4);
        Main main = new Main();
        assertEquals("This child does not belong to this family.", main.deleteChildMessage(x));
    }

    @Test
    public void deleteChild3() {   // delete children[index] which this index is less than children length
        Human family1Mother = new Human("Sevinc", "Huseynova", 1967, 80, new String[][]{{DayOfWeek.MONDAY.name(), "go shopping"}});
        Human family1Father = new Human("Mirze", "Huseynov", 1965, 90);
        Human family1Child1 = new Human("Rovshan", "Huseynov", 1994);
        Human family1Child2 = new Human("Sabina", "Huseynova", 1993);
        Family f1 = new Family(family1Mother, family1Father);
        f1.addChild(family1Child1);
        f1.addChild(family1Child2);
        int x = f1.deleteChild(0);
        Main main = new Main();
        assertEquals("Child was found and deleted.", main.deleteChildMessage(x));
    }

    @Test
    public void deleteChild4() {   // delete children[index] which this index is bigger than children length
        Human family1Mother = new Human("Sevinc", "Huseynova", 1967, 80, new String[][]{{DayOfWeek.MONDAY.name(), "go shopping"}});
        Human family1Father = new Human("Mirze", "Huseynov", 1965, 90);
        Human family1Child1 = new Human("Rovshan", "Huseynov", 1994);
        Human family1Child2 = new Human("Sabina", "Huseynova", 1993);
        Family f1 = new Family(family1Mother, family1Father);
        f1.addChild(family1Child1);
        f1.addChild(family1Child2);
        int x = f1.deleteChild(5);
        Main main = new Main();
        assertEquals("This child does not belong to this family.", main.deleteChildMessage(x));
    }

    @Test
    public void deleteChild5() {   // trying to delete a pet from children array
        Human family1Mother = new Human("Sevinc", "Huseynova", 1967, 80, new String[][]{{DayOfWeek.MONDAY.name(), "go shopping"}});
        Human family1Father = new Human("Mirze", "Huseynov", 1965, 90);
        Human family1Child1 = new Human("Rovshan", "Huseynov", 1994);
        Human family1Child2 = new Human("Sabina", "Huseynova", 1993);
        Human family1Child3 = new Human("Kamil", "Huseynov", 1997);
        Family f1 = new Family(family1Mother, family1Father);
        f1.addChild(family1Child1);
        f1.addChild(family1Child2);
        f1.addChild(family1Child3);
        Pet myDog1 = new Pet(Species.DOG, "Ares");
        int x = f1.deleteChild(myDog1);
        Main main = new Main();
        assertEquals("Object is not equivalent to any array element. Object is not Human.", main.deleteChildMessage(x));
    }
}