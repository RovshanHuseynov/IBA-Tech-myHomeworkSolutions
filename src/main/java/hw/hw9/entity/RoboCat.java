package hw.hw9.entity;

import hw.hw9.interfacee.Foulable;
import hw.hw9.enumm.Species;

import java.util.HashSet;
import java.util.Set;

public class RoboCat extends Pet implements Foulable {

    public RoboCat() {
        super(Species.ROBO_CAT, "", 0, 0, new HashSet<>());
    }

    public RoboCat(Species species) {
        super(species, "", 0, 0, new HashSet<>());
    }

    public RoboCat(Species species, String nickname) {
        super(species, nickname, 0, 0, new HashSet<>());
    }

    public RoboCat(Species species, String nickname, int age, int trickLevel) {
        super(species, nickname, age, trickLevel, new HashSet<>());
    }

    public RoboCat(Species species, String nickname, int age, int trickLevel, Set<String> habits) {
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
