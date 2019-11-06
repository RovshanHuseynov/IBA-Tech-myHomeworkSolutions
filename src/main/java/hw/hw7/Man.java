package hw.hw7;

public final class Man extends Human {
    public void repairCar() {
        System.out.println("MakeUp");
    }

    public void greetPet(Pet pet) {
        System.out.println("Hey, " + pet.getNickname());
    }
}
