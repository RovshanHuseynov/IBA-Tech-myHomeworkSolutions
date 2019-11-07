package hw.hw7;

public class Fish extends AbstractPet {
    @Override
    public void respond() {
        System.out.println("Hello, owner. I am - " + getNickname() + ". I miss you!");
    }
}
