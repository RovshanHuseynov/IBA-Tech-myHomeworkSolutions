package hw.hw4;

public class Human {
    String name;
    String surname;
    short year;
    byte iq;
    Pet pet;
    Human mother = new Human();
    Human father = new Human();
    String [][] schedule = new String[7][2];

    public Human() {
    }

    public Human(String name, String surname, short year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, short year, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, String surname, short year, byte iq, Pet pet, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.father = father;
        this.mother = mother;
    }

    public void greetPet(String petName){
        System.out.println("Hello, " + petName);
    }

    public void describePet(){
        System.out.println("I have a [species], he is [age] years old, he is [very sly]>50/[almost not sly]<50");
    }

    public String toString(Human h) {
            return "{name=" + h.name + ", surname=" + h.surname + ", year=" + h.year + ", iq=" + h.iq +
                    ", mother=" + h.mother.name + " " + h.mother.surname + ", father=" + h.father.name + h.father.surname +
                    ", pet=" + h.pet + "}";
    }
}
