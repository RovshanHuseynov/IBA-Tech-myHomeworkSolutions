package hw.hw5;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;   //  a whole number from 1 to 100
    private Pet pet;
    private Human mother;
    private Human father;
    private String [][] schedule;   // 2d array: [day of the week] x [type of the activity]

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
        System.out.println("Hello, " + h.pet.getNickname());
    }

    public void describePet(Human h){
        String trickLevel = h.pet.getTrickLevel() > 50 ? "very sly" : "almost not sly";
        System.out.println("I have a " + h.pet.getSpecies() + ", he is " + h.pet.getAge() + " years old, he is " + trickLevel);
    }

    public String toString(Human h) {
        return "Human{name='" + h.name + "', surname='" + h.surname + "', year=" + h.year + ", iq=" + h.iq
                +  ", mother=" + h.mother.name + " " + h.mother.surname + ", father=" + h.father.name + " " + h.father.surname
                + ", pet=" + h.pet.toString(h.pet) + "}";
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

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }
}
