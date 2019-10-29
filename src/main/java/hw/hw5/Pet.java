package hw.hw5;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;    // a whole number from 1 to 100
    private String[] habits;

    public Pet() {    // constructor
        this("", "", 0, 0, new String[]{});
    }

    public Pet(String species, String nickname) {     // constructor
        this(species, nickname, 0, 0, new String[]{});
    }

    public Pet(String species, String nickname, int age, int trickLevel) {     // constructor
        this(species, nickname, age, trickLevel, new String[]{});
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {     // constructor
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("Hello, owner. I am - " + getNickname() + ". I miss you!");
    }

    public void foul() {
        System.out.println("'I need to cover it up");
    }

    @Override
    public String toString() {
        String s = getSpecies() + "{" + "nickname='" + getNickname() + '\'' + ", age=" + getAge()
                + ", trickLevel=" + getTrickLevel() + ", habits=";
        if (getHabits().length > 0) {
            s += Arrays.toString(getHabits());
        } else {
            s += "[]";
        }
        s += "}";
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        else if (obj == this) return true;
        else if (!(obj instanceof Pet)) return false;

        Pet that = (Pet) obj;
        if (that.getAge() == this.getAge() && that.getTrickLevel() == this.getTrickLevel()
                && that.getSpecies().equals(this.getSpecies())
                && that.getNickname().equals(this.getNickname())
                && Arrays.toString(that.getHabits()).equals(Arrays.toString(this.getHabits()))) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getSpecies(), getNickname(), getAge(), getTrickLevel());
        result = 31 * result + Arrays.hashCode(getHabits());
        return result;
    }

    public String getSpecies() {
        return species;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }
}
