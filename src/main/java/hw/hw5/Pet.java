package hw.hw5;

import java.util.Arrays;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;    // a whole number from 1 to 100
    private String [] habits;

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

    public void respond(){
        System.out.println("Hello, owner. I am - " + getNickname() + ". I miss you!");
    }

    public void foul(){
        System.out.println("'I need to cover it up");
    }

    @Override
    public String toString() {
        return   species + "{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        else if(this == obj) return true;
        else if(!(obj instanceof Pet)) return false;

        Pet that = (Pet) obj;
        if(that.species == this.species && that.nickname == this.nickname && that.age == this.age && that.trickLevel == this.trickLevel){
            if(that.habits.length == this.habits.length){  //  habits is 1D array, so I must check all items by one by
                for(int i=0; i<that.habits.length; i++){
                    if(!that.habits[i].equals(this.habits[i])){
                        return false;
                    }
                }
                return true;
            }
        }

        return false;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }
}
