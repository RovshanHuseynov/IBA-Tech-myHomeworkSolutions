package hw.hw7;

public final class Woman extends Human {
    public void makeup() {
        System.out.println("MakeUp");
    }

    public void greetPet(Pet pet) {
        System.out.println("Hello my beauty, " + pet.getNickname());
    }
}
