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
    String [][] schedule;   // 2d array: [day of the week] x [type of the activity]

    public Human() {     // constructor
    }

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

    public void greetPet(Human h){
        System.out.println("Hello, " + h.pet.nickname);
    }

    public void describePet(Human h){
        String trickLevel = h.pet.trickLevel > 50 ? "very sly" : "almost not sly";
        System.out.println("I have a " + h.pet.species + ", he is " + h.pet.age + " years old, he is " + trickLevel);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", mother=" + mother.name + " " + mother.surname +
                ", father=" + father.name + " " + father.surname +
                ", pet=" + pet +
                '}';
    }

    public boolean feedPet(Human h){
        System.out.println("isn't it time for feeding?");
        Random random = new Random();
        int x = random.nextInt(100);

        if(x < h.pet.trickLevel){
            System.out.println("I think " + h.pet.nickname + " is not hungry.");
            return false;
        }
        else{
            System.out.println("Hm... I will feed " + h.pet.nickname + "'s");
            return true;
        }
    }
}
