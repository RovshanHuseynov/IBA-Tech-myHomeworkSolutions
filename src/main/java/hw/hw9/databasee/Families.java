package hw.hw9.databasee;

import hw.hw9.entity.Family;

import java.util.Arrays;
import java.util.List;

public class Families {
    Humans humans = new Humans();
    Family family1 = new Family(1, humans.family1Mother, humans.family1Father);
    Family family2 = new Family(2, humans.family2Mother, humans.family2Father);
    Family family3 = new Family(3, humans.family3Mother, humans.family3Father);
    Family family4 = new Family(4, humans.family3Mother, humans.family3Father);

    public List<Family> create(){
        List<Family> families = Arrays.asList(family1, family2, family3, family4);
        return families;
    }
}
