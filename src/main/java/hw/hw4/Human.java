package hw.hw4;

import java.util.Random;

public class Human {
    String name;
    String surname;
    int year;
    int iq;   //  a whole number from 1 to 100
    Pet pet;
    Human mother;
    Human father;

    public Human(String name, String surname, int year) {      // constructor
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human father, Human mother) {   // constructor
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human father, Human mother) {    // constructor
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.father = father;
        this.mother = mother;
    }

    public void greetPet() {
        System.out.println("Hello, " + pet.nickname);
    }

    public void describePet() {
        String trickLevel = pet.trickLevel > 50 ? "very sly" : "almost not sly";
        System.out.println("I have a " + pet.species + ", he is " + pet.age + " years old, he is " + trickLevel);
    }

    @Override
    public String toString() {
        return "Human{name='" + name + '\'' + ", surname='" + surname + '\'' + ", year=" + year
                + ", iq=" + iq + ", mother=" + mother.name + " " + mother.surname + ", father=" + father.name
                + " " + father.surname + ", pet=" + pet + "]}";
    }

    public boolean feedPet() {
        System.out.println("isn't it time for feeding?");
        Random random = new Random();
        int x = random.nextInt(100);

        if (x < pet.trickLevel) {
            System.out.println("I think " + pet.nickname + " is not hungry.");
            return false;
        } else {
            System.out.println("Hm... I will feed " + pet.nickname + "'s");
            return true;
        }
    }
}
