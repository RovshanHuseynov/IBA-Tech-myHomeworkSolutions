package hw.hw8;

import java.util.ArrayList;
import java.util.List;

public class Fish extends AbstractPet {

    public Fish() {
        super(Species.FISH, "", 0, 0, new ArrayList<>());
    }

    public Fish(Species species) {
        super(species, "", 0, 0, new ArrayList<>());
    }

    public Fish(Species species, String nickname) {
        super(species, nickname, 0, 0, new ArrayList<>());
    }

    public Fish(Species species, String nickname, int age, int trickLevel) {
        super(species, nickname, age, trickLevel, new ArrayList<>());
    }

    public Fish(Species species, String nickname, int age, int trickLevel, List<String> habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner. I am - " + getNickname() + ". I miss you!");
    }
}
