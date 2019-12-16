package hw.hw9.databasee;

import hw.hw9.entity.Family;

import java.util.Arrays;
import java.util.List;

public class Families {
    Humans humans = new Humans();
    Family family1 = new Family(1, humans.family1Mother, humans.family1Father);

    public List<Family> create(){
        List<Family> families = Arrays.asList(family1);
        return families;
    }
}
