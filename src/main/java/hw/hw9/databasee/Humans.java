package hw.hw9.databasee;

import hw.hw9.entity.Human;
import hw.hw9.enumm.DayOfWeek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Humans {
    Human family1Mother = new Human("Sevinc", "Huseynova", 1967, 80,
            new HashMap<DayOfWeek, List<String>>() {{
                put(DayOfWeek.MONDAY, Arrays.asList("go shopping", "take care of children"));
            }});
    Human family1Father = new Human("Mirze", "Huseynov", 1965, 90);
    Human family1Child1 = new Human("Rovshan", "Huseynov", 1994);
    Human family1Child2 = new Human("Sabina", "Huseynova", 1993);
    Human family1Child3 = new Human("Kamil", "Huseynov", 1997);
    Human family1Child4 = new Human("Elekber", "Huseynov", 1990, 90,
            new HashMap<DayOfWeek, List<String>>() {{
                put(DayOfWeek.MONDAY, Arrays.asList("do homework"));
                put(DayOfWeek.SUNDAY, Arrays.asList("have a rest"));
            }});
    Human family1Child5 = new Human("Ramin", "Huseynov", 1980, 80,
            new HashMap<DayOfWeek, List<String>>() {{
                put(DayOfWeek.MONDAY, Arrays.asList("do homework"));
                put(DayOfWeek.SUNDAY, Arrays.asList("have a rest"));
            }});
    Human family1Child6 = new Human("Ramin", "Huseynov", 1980, 80,
            new HashMap<DayOfWeek, List<String>>() {{
                put(DayOfWeek.MONDAY, Arrays.asList("do homework"));
                put(DayOfWeek.SUNDAY, Arrays.asList("have a rest"));
            }});
    Human family1Child7 = new Human("Ramin", "Huseynov", 1980, 80,
            new HashMap<DayOfWeek, List<String>>() {{
                put(DayOfWeek.MONDAY, Arrays.asList("do homework"));
                put(DayOfWeek.TUESDAY, Arrays.asList("read books"));
                put(DayOfWeek.SUNDAY, Arrays.asList("have a rest"));
            }});
    Human family1Child8 = new Human("Ramin", "Huseynov", 1980, 80,
            new HashMap<DayOfWeek, List<String>>() {{
                put(DayOfWeek.MONDAY, Arrays.asList("sleep"));
                put(DayOfWeek.TUESDAY, Arrays.asList("read books"));
                put(DayOfWeek.SUNDAY, Arrays.asList("have a rest"));
            }});

    public List<Human> create() {
        List<Human> humans = Arrays.asList(family1Mother, family1Father, family1Child1, family1Child2,
                family1Child3, family1Child4, family1Child5, family1Child6, family1Child7, family1Child8);
        return humans;
    }
}
