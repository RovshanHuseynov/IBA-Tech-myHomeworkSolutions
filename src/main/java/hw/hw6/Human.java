package hw.hw6;

import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule;

    public Human() {     // constructor
        this("name", "surname", 0, 0, new String[][]{});
    }

    public Human(String name, String surname, int year) {   // constructor
        this(name, surname, year, 0, new String[][]{});
    }

    public Human(String name, String surname, int year, int iq) {    // constructor
        this(name, surname, year, iq, new String[][]{});
    }

    public Human(String name, String surname, int year, int iq, String[][] schedule) {    // constructor
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Removal of Unnecessary Objects");
    }

    @Override
    public String toString() {
        String s = "Human{" + "name='" + getName() + '\'' + ", surname='" + getSurname() + '\'' +
                ", year=" + getYear() + ", iq=" + getIq() + ", schedule=";

        if (getSchedule().length > 0) {
            for (int i = 0; i < getSchedule().length; i++) {
                s += Arrays.toString(getSchedule()[i]);
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
            if (this.getSchedule().length == that.getSchedule().length) {   // schedule is 2D array, so I must check row by row
                for (int i = 0; i < this.getSchedule().length; i++) {
                    if (!Arrays.equals(this.getSchedule()[i], that.getSchedule()[i])) {
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
