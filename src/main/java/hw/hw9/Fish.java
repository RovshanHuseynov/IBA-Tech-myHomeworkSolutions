package hw.hw9;

import java.util.HashSet;
import java.util.Set;

public class Fish extends Pet {

    public Fish() {
        super(Species.FISH, "", 0, 0, new HashSet<>());
    }

    public Fish(Species species) {
        super(species, "", 0, 0, new HashSet<>());
    }

    public Fish(Species species, String nickname) {
        super(species, nickname, 0, 0, new HashSet<>());
    }

    public Fish(Species species, String nickname, int age, int trickLevel) {
        super(species, nickname, age, trickLevel, new HashSet<>());
    }

    public Fish(Species species, String nickname, int age, int trickLevel, Set<String> habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner. I am - " + getNickname() + ". I miss you!");
    }
}
