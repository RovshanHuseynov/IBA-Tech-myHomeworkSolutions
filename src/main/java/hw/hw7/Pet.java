package hw.hw7;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;    // a whole number from 1 to 100
    private String[] habits;

    public Pet() {    // constructor
    }

    public Pet(String species, String nickname) {     // constructor
        this.species = species;
        this.nickname = nickname;
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
        String s = "Pet{" + "nickname='" + nickname + '\'' + ", age=" + age + ", trickLevel=" + trickLevel + ", habits=[";
        if (habits != null) {
            s += Arrays.toString(habits);
        }
        s += "]}";
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        else if (obj == this) return true;
        else if (!(obj instanceof Pet)) return false;

        Pet that = (Pet) obj;
        if (that.age == this.age && that.trickLevel == this.trickLevel
                && that.species.equals(this.species)
                && that.nickname.equals(this.nickname)
                && Arrays.toString(that.habits).equals(Arrays.toString(this.habits))) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickname, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }
}
