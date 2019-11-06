package hw.hw6;

import java.util.Arrays;

public class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet() {
        this(null, "", 0, 0, new String[]{});
    }

    public Pet(Species species, String nickname) {
        this(species, nickname, 0, 0, new String[]{});
    }

    public Pet(Species species, String nickname, int age, int trickLevel) {
        this(species, nickname, age, trickLevel, new String[]{});
    }

    public Pet(Species species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Removal of Unnecessary Objects");
    }

    @Override
    public String toString() {
        String s = getSpecies() + "{" + "nickname='" + getNickname() + '\'' + ", age=" + getAge()
                + ", trickLevel=" + getTrickLevel() + ", habits=";
        if (habits.length > 0) {
            s += Arrays.toString(habits);
        } else {
            s += "[]";
        }

        s += ", canFly=" + getSpecies().isCanFly();
        s += ", numberOfLegs=" + getSpecies().getNumberOfLegs();
        s += ", hasFur=" + getSpecies().isHasFur();

        s += "}";
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.hashCode() != obj.hashCode()) {
            return false;
        }

        if (obj == null) return false;
        else if (obj == this) return true;
        else if (!(obj instanceof Pet)) return false;

        Pet that = (Pet) obj;
        if (that.getAge() == this.getAge() && that.getTrickLevel() == this.getTrickLevel()
                && that.getSpecies().equals(this.getSpecies())
                && that.getNickname().equals(this.getNickname())
                && Arrays.equals(this.habits, that.habits)) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        int r = getSpecies().hashCode();
        r = r * 31 + getNickname().hashCode();
        r = r * 31 + getAge();
        r = r * 31 + getTrickLevel();
        return r;
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

    public Species getSpecies() {
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
