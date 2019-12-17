package hw.hw8;

import java.util.HashSet;
import java.util.Set;

public abstract class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private Set<String> habits;

    public Pet() {
        this(Species.UNKNOWN, "", 0, 0, new HashSet<>());
    }

    public Pet(Species species) {
        this(species, "", 0, 0, new HashSet<>());
    }

    public Pet(Species species, String nickname) {
        this(species, nickname, 0, 0, new HashSet<>());
    }

    public Pet(Species species, String nickname, int age, int trickLevel) {
        this(species, nickname, age, trickLevel, new HashSet<>());
    }

    public Pet(Species species, String nickname, int age, int trickLevel, Set<String> habits) {
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
        StringBuilder sb = new StringBuilder();
        sb.append(species);
        sb.append("{ nickname=");
        sb.append("\'");
        sb.append(nickname);
        sb.append("\'");
        sb.append(", age=");
        sb.append(age);
        sb.append(", trickLevel=");
        sb.append(trickLevel);
        sb.append(", habits=");

        if (habits.size() > 0) {
            int cnt = 0;

            sb.append("[");
            for (String h : habits) {
                cnt++;
                sb.append(h);
                if (cnt < habits.size()) sb.append(", ");
            }
            sb.append("]");
        } else {
            sb.append("[]");
        }

        sb.append(", canFly=");
        sb.append(species.isCanFly());
        sb.append(", numberOfLegs=");
        sb.append(species.getNumberOfLegs());
        sb.append(", hasFur=");
        sb.append(species.isHasFur());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        else if (!(obj instanceof Pet)) return false;
        else if (obj == this) return true;

        Pet that = (Pet) obj;
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

    public Set<String> getHabits() {
        return habits;
    }
}
