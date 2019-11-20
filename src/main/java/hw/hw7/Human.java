package hw.hw7;

import java.util.Arrays;
import java.util.Random;

public class Human implements HumanCreatorable {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule;
    private Family family;

    public Human() {
        this("", "", 0, 0, new String[][]{}, null);
    }

    public Human(String name, String surname, int year) {
        this(name, surname, year, 0, new String[][]{}, null);
    }

    public Human(String name, String surname, int year, int iq) {
        this(name, surname, year, iq, new String[][]{}, null);
    }

    public Human(String name, String surname, int year, int iq, String[][] schedule) {
        this(name, surname, year, iq, schedule, null);
    }

    public Human(String name, String surname, int year, int iq, String[][] schedule, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
        this.family = family;
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
        if (obj == null) return false;
        else if (this == obj) return true;
        else if (!(obj instanceof Human)) return false;

        Human that = (Human) obj;
        if (this.getYear() == that.getYear() && this.getIq() == that.getIq()
                && this.getName().equals(that.getName()) && this.getSurname().equals(that.getSurname())) {
            if (this.schedule.length == that.schedule.length) {
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

    @Override
    public Human bornChild(Family family) {
        String[] womanNames = {"Lale", "Kemale", "Fidan", "Nergiz", "Sunbul", "Lamiye", "Aydan"};
        String[] manNames = {"Samir", "Amil", "Kamil", "Letif", "Eli", "Arif", "Ehed"};
        Random random = new Random();
        int childSex = random.nextInt(2);
        String childName = "";
        String childSurname = family.getFather().getSurname();
        int childIq = (family.getFather().getIq() + family.getMother().getIq()) / 2;
        if (childSex == 0) {
            childName = womanNames[random.nextInt(7)];
            Woman bornChild = new Woman(childName, childSurname, 1990, childIq);
            family.addChild(bornChild);
            return bornChild;
        } else if (childSex == 1) {
            childName = manNames[random.nextInt(7)];
            Man bornChild = new Man(childName, childSurname, 1990, childIq);
            family.addChild(bornChild);
            return bornChild;
        }
        return new Human();
    }

    public void greetPet(Pet pet) {
        System.out.println("Hello, " + pet.getNickname());
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

    public void describePet(Pet pet) {
        String trickLevel = pet.getTrickLevel() > 50 ? "very sly" : "almost not sly";
        System.out.println("I have a " + pet.getSpecies() + ", he is " + pet.getAge() + " years old, he is " + trickLevel);
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Family getFamily() {
        return family;
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
