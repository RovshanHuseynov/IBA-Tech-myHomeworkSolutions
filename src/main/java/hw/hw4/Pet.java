package hw.hw4;

public class Pet {

    String species;
    String nickname;
    byte age;
    byte trickLevel;
    String [] habits = new String [50];

    public Pet() {
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, byte age, byte trickLevel, String [] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void eat(){
        System.out.println("I am eating");
    }

    public void respond(String petName){
        System.out.println("Hello, owner. I am - " + petName + ". I miss you!");
    }

    public void foul(){
        System.out.println("'I need to cover it up");
    }

    public String toString(Pet p) {
        return p.species + "{nikname=" + p.nickname + ", age=" + p.age + ", tricLevel=" + p.trickLevel + ", habits=" + p.habits.toString() + "}";
    }
}
