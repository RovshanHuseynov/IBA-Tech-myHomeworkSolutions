package hw.hw8;

import java.util.ArrayList;
import java.util.List;

public class RoboCat extends AbstractPet implements Foulable {

    public RoboCat() {
        super(Species.ROBOCAT, "", 0, 0, new ArrayList<>());
    }

    public RoboCat(Species species) {
        super(species, "", 0, 0, new ArrayList<>());
    }

    public RoboCat(Species species, String nickname) {
        super(species, nickname, 0, 0, new ArrayList<>());
    }

    public RoboCat(Species species, String nickname, int age, int trickLevel) {
        super(species, nickname, age, trickLevel, new ArrayList<>());
    }

    public RoboCat(Species species, String nickname, int age, int trickLevel, List<String> habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner. I am - " + getNickname() + ". I miss you!");
    }

    @Override
    public void foul() {
        System.out.println("'I need to cover it up");
    }
}
