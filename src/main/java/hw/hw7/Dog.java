package hw.hw7;

public class Dog extends AbstractPet implements Foulable {
    public Dog() {
    }

    public Dog(String nickname) {
        super(nickname);
    }

    public Dog(String nickname, int age, int trickLevel) {
        super(nickname, age, trickLevel);
    }

    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
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
