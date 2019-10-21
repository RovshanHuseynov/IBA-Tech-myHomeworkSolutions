package hw.hw4;

import java.util.Arrays;

public class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel;    // a whole number from 1 to 100
    String [] habits;

    public Pet() {    // constructor
    }

    public Pet(String species, String nickname) {     // constructor
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel, String [] habits) {     // constructor
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void eat(){
        System.out.println("I am eating");
    }

    public void respond(Pet p){
        System.out.println("Hello, owner. I am - " + p.nickname + ". I miss you!");
    }

    public void foul(){
        System.out.println("'I need to cover it up");
    }

    public String toString(Pet p) {
        return p.species + "{nikname='" + p.nickname + "', age=" + p.age + ", trickLevel=" + p.trickLevel
                + ", habits=" + Arrays.toString(p.habits) + "}";
    }
}
