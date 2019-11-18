package hw.hw7;

public class Dog extends AbstractPet implements Foulable {

    public Dog() {
        super(Species.DOG, "", 0, 0, new String[]{});
    }

    public Dog(Species species) {
        super(species, "", 0, 0, new String[]{});
    }

    public Dog(Species species, String nickname) {
        super(species, nickname, 0, 0, new String[]{});
    }

    public Dog(Species species, String nickname, int age, int trickLevel) {
        super(species, nickname, age, trickLevel, new String[]{});
    }

    public Dog(Species species, String nickname, int age, int trickLevel, String[] habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner. I am - " + getNickname() + ". I miss you!");
    }

    @Override
    public void foul() {
        System.out.println("'I need to cover it up");
    }
}
