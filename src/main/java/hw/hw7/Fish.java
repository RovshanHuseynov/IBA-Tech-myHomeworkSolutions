package hw.hw7;

public class Fish extends AbstractPet {

    public Fish() {
        super(Species.FISH, "", 0, 0, new String[]{});
    }

    public Fish(Species species) {
        super(species, "", 0, 0, new String[]{});
    }

    public Fish(Species species, String nickname) {
        super(species, nickname, 0, 0, new String[]{});
    }

    public Fish(Species species, String nickname, int age, int trickLevel) {
        super(species, nickname, age, trickLevel, new String[]{});
    }

    public Fish(Species species, String nickname, int age, int trickLevel, String[] habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner. I am - " + getNickname() + ". I miss you!");
    }
}
