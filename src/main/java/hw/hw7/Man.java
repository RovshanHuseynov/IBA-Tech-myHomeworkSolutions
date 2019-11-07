package hw.hw7;

public final class Man extends Human {
    public void repairCar() {
        System.out.println("MakeUp");
    }

    public Man(String name, String surname, int year, int iq) {
        super(name, surname, year, iq);
    }

    public void greetPet(AbstractPet pet) {
        System.out.println("Hey, " + pet.getNickname());
    }
}
