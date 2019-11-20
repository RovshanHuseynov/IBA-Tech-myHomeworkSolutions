package hw.hw8;

import java.util.HashSet;
import java.util.Set;

public class DomesticCat extends Pet implements Foulable {

    public DomesticCat() {
        super(Species.DOMESTIC_CAT, "", 0, 0, new HashSet<>());
    }

    public DomesticCat(Species species) {
        super(species, "", 0, 0, new HashSet<>());
    }

    public DomesticCat(Species species, String nickname) {
        super(species, nickname, 0, 0, new HashSet<>());
    }

    public DomesticCat(Species species, String nickname, int age, int trickLevel) {
        super(species, nickname, age, trickLevel, new HashSet<>());
    }

    public DomesticCat(Species species, String nickname, int age, int trickLevel, Set<String> habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner. I am - " + getNickname() + ". I miss you!");
    }

    @Override
    public void foul() {
        System.out.println("I need to cover it up");
    }
}
