package hw.hw7;

public final class Man extends Human {

    public Man() {
        super("", "", 0, 0, new String[][]{}, null);
    }

    public Man(String name, String surname, int year) {
        super(name, surname, year, 0, new String[][]{}, null);
    }

    public Man(String name, String surname, int year, int iq) {
        super(name, surname, year, iq, new String[][]{}, null);
    }

    public Man(String name, String surname, int year, int iq, String[][] schedule) {
        super(name, surname, year, iq, schedule, null);
    }

    public Man(String name, String surname, int year, int iq, String[][] schedule, Family family) {
        super(name, surname, year, iq, schedule, family);
    }

    public void repairCar() {
        System.out.println("MakeUp");
    }

    public void greetPet(Pet pet) {
        System.out.println("Hey, " + pet.getNickname());
    }
}
