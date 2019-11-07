package hw.hw7;

public class DomesticCat extends AbstractPet implements Foulable {
    public DomesticCat() {
    }

    public DomesticCat(String nickname) {
        super(nickname);
    }

    public DomesticCat(String nickname, int age, int trickLevel) {
        super(nickname, age, trickLevel);
    }

    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner. I am - " + getNickname() + ". I miss you!");
    }

    @Override
    public void foul() {
        System.out.println("I need to cover it up");
    }
}
