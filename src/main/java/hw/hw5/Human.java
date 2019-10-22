package hw.hw5;

import java.util.Arrays;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;   //  a whole number from 1 to 100
    private String [][] schedule;   // 2d array: [day of the week] x [type of the activity]
    private Family family;

    public Human() {     // constructor
    }

    public Human(String name, String surname, int year) {      // constructor
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Family family) {   // constructor
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.family = family;
    }

    public Human(String name, String surname, int year, int iq, Family family) {    // constructor
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.family = family;
    }

    public void greetPet(Human h){
        System.out.println("Hello, " + h.family.pet.getNickname());
    }

    public void describePet(Human h){
        String trickLevel = h.family.pet.getTrickLevel() > 50 ? "very sly" : "almost not sly";
        System.out.println("I have a " + h.family.pet.getSpecies() + ", he is " + h.family.pet.getAge() + " years old, he is " + trickLevel);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }

    public boolean feedPet(Human h){
        System.out.println("isn't it time for feeding?");
        Random random = new Random();
        int x = random.nextInt(100);

        if(x < h.family.pet.getTrickLevel()){
            System.out.println("I think " + h.family.pet.getNickname() + " is not hungry.");
            return false;
        }
        else{
            System.out.println("Hm... I will feed " + h.family.pet.getNickname() + "'s");
            return true;
        }
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

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }
}
