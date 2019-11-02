package hw.hw6;

import java.util.Arrays;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule;
    private Family family;

    public Human(String name, String surname, int year) {   // constructor
        this(name, surname, year, 0, new String[][]{});
    }

    public Human(String name, String surname, int year, int iq) {    // constructor
        this(name, surname, year, iq, new String[][]{});
    }

    public Human(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
        this.family = null;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Removal of Unnecessary Objects");
    }

    @Override
    public String toString() {
        String s = "Human{" + "name='" + getName() + '\'' + ", surname='" + getSurname() + '\'' +
                ", year=" + getYear() + ", iq=" + getIq() + ", schedule=";

        if (schedule.length > 0) {
            for (int i = 0; i < schedule.length; i++) {
                s += Arrays.toString(schedule[i]);
            }
        } else {
            s += "[]";
        }

        s += "}";
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.hashCode() != obj.hashCode()) {
            return false;
        }

        if (obj == null) return false;
        else if (this == obj) return true;
        else if (!(obj instanceof Human)) return false;

        Human that = (Human) obj;
        if (this.getYear() == that.getYear() && this.getIq() == that.getIq()
                && this.getName().equals(that.getName()) && this.getSurname().equals(that.getSurname())) {
            if (this.schedule.length == that.schedule.length) {   // schedule is 2D array, so I must check row by row
                for (int i = 0; i < this.schedule.length; i++) {
                    if (!Arrays.equals(this.schedule[i], that.schedule[i])) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int r = getName().hashCode();
        r = r * 31 + getSurname().hashCode();
        r = r * 31 + getYear();
        r = r * 31 + getIq();
        return r;
    }

    public void greetPet() {
        System.out.println("Hello, " + getPet().getNickname());
    }

    public boolean feedPet() {
        System.out.println("isn't it time for feeding?");
        Random random = new Random();
        int x = random.nextInt(100);

        if (x < getPet().getTrickLevel()) {
            System.out.println("I think " + getPet().getNickname() + " is not hungry.");
            return false;
        } else {
            System.out.println("Hm... I will feed " + getPet().getNickname() + "'s");
            return true;
        }
    }

    public void describePet() {
        String trickLevel = getPet().getTrickLevel() > 50 ? "very sly" : "almost not sly";
        System.out.println("I have a " + getPet().getSpecies() + ", he is " + getPet().getAge() + " years old, he is " + trickLevel);
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public int getIq() {
        return iq;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public Family getFamily() {
        return family;
    }
}
