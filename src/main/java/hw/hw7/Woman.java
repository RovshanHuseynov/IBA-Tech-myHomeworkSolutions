package hw.hw7;

public final class Woman extends Human {
    public void makeup() {
        System.out.println("MakeUp");
    }

    public Woman(String name, String surname, int year, int iq) {
        super(name, surname, year, iq);
    }

    public void greetPet(Pet pet) {
        System.out.println("Hello my beauty, " + pet.getNickname());
    }
}
