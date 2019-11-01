package hw.hw7;

public class Fish extends Pet {
    @Override
    public void respond() {
        System.out.println("Hello, owner. I am - " + getNickname() + ". I miss you!");
    }
}
