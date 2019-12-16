package hw.hw9.databasee;

import hw.hw9.entity.Family;
import hw.hw9.entity.Human;
import hw.hw9.enumm.DayOfWeek;

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

    Human family2Mother = new Human("Ayise", "Agayeva", 1950);
    Human family2Father = new Human("Samir", "Agayev", 1945);
    Human family2Child1 = new Human("Amil", "Agayev", 1964);
    Human family2Child2 = new Human("Selim", "Agayev", 1970);
    Human family3Mother = new Human("Lale", "Melikova", 1950);
    Human family3Father = new Human("Zamiq", "Melikov", 1945);
    Human family3Child1 = new Human("Suqra", "Melikova", 1964);
    Human family3Child2 = new Human("Nergiz", "Melikova", 1970);
    Human family4Child1 = new Human("Emil", "Eliyev", 2001);


    public List<Human> create() {
        List<Human> humans = Arrays.asList(family1Mother, family1Father, family1Child1, family1Child2,
                family1Child3, family1Child4, family1Child5, family1Child6, family1Child7, family1Child8,
                family2Mother, family2Father, family2Child1, family2Child2, family3Mother, family3Father,
                family3Child1, family3Child2, family4Child1);
        return humans;
    }
}
