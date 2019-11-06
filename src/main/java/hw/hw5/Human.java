package hw.hw5;

import java.util.Arrays;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule;
    private Family family;

    public Human(String name, String surname, int year) {
        this(name, surname, year, 0, null);
    }

    public Human(String name, String surname, int year, int iq) {
        this(name, surname, year, iq, null);
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
    public String toString() {
        String s = "Human{" + "name='" + getName() + '\'' + ", surname='" + getSurname() + '\'' +
                ", year=" + getYear() + ", iq=" + getIq() + ", schedule=";

        if (schedule != null && schedule.length > 0) {
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

    public boolean feedPet(Pet pet) {
        System.out.println("isn't it time for feeding?");
        Random random = new Random();
        int x = random.nextInt(100);

        if (x < pet.getTrickLevel()) {
            System.out.println("I think " + pet.getNickname() + " is not hungry.");
            return false;
        } else {
            System.out.println("Hm... I will feed " + pet.getNickname() + "'s");
            return true;
        }
    }

    public void greetPet(Pet pet) {
        System.out.println("Hello, " + pet.getNickname());
    }

    public void describePet(Pet pet) {
        String trickLevel = pet.getTrickLevel() > 50 ? "very sly" : "almost not sly";
        System.out.println("I have a " + pet.getSpecies() + ", he is " + pet.getAge() + " years old, he is " + trickLevel);
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
}
