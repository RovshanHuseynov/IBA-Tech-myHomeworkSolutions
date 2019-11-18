package hw.hw8;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private List<String> habits;

    public AbstractPet() {
        this(Species.UNKNOWN, "", 0, 0, new ArrayList<>());
    }

    public AbstractPet(Species species) {
        this(species, "", 0, 0, new ArrayList<>());
    }

    public AbstractPet(Species species, String nickname) {
        this(species, nickname, 0, 0, new ArrayList<>());
    }

    public AbstractPet(Species species, String nickname, int age, int trickLevel) {
        this(species, nickname, age, trickLevel, new ArrayList<>());
    }

    public AbstractPet(Species species, String nickname, int age, int trickLevel, List<String> habits) {
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
        if (habits.size() > 0) {
            s += "[";
            for (int i = 0; i > habits.size() - 1; i++) {
                s += habits.get(i) + ", ";
            }
            s += habits.get(habits.size() - 1) + "]";
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
        if (obj == null) return false;
        else if (obj == this) return true;
        else if (!(obj instanceof AbstractPet)) return false;

        if (this.hashCode() != obj.hashCode()) {
            return false;
        }

        AbstractPet that = (AbstractPet) obj;
        if (that.getAge() == this.getAge() && that.getTrickLevel() == this.getTrickLevel()
                && that.getSpecies().equals(this.getSpecies())
                && that.getNickname().equals(this.getNickname())
                && this.habits.equals(that.habits)) {
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

    public abstract void respond();

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

    public List<String> getHabits() {
        return habits;
    }
}
