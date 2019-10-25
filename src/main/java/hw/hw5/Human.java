package hw.hw5;

import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;   //  a whole number from 1 to 100
    private String [][] schedule;   // 2d array: [day of the week] x [type of the activity]

    public Human() {     // constructor
    }

    public Human(String name, String surname, int year) {   // constructor
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq) {    // constructor
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
    }

    public Human(String name, String surname, int year, int iq, String [][] schedule) {    // constructor
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return   "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=[" + Arrays.toString(schedule) +
                "]}";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        else if(this == obj) return true;
        else if(!(obj instanceof Human)) return false;

        Human that = (Human) obj;
        if(this.name == that.name && this.surname == that.surname && this.year == that.year && this.iq == that.iq){
            if(this.schedule.length == that.schedule.length){   // schedule is 2D array, so I must check all items by one by
                for(int i=0; i<this.schedule.length; i++){
                    if(this.schedule[i].length != that.schedule[i].length) {
                        return false;
                    }

                    for(int j=0; j<this.schedule[i].length; j++){
                        if(!this.schedule[i][j].equals(that.schedule[i][j])){
                            return false;
                        }
                    }
                }

                return true;
            }
        }

        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }
}
