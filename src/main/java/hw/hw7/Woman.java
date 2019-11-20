package hw.hw7;

public final class Woman extends Human {

    public Woman() {
        super("", "", 0, 0, new String[][]{}, null);
    }

    public Woman(String name, String surname, int year) {
        super(name, surname, year, 0, new String[][]{}, null);
    }

    public Woman(String name, String surname, int year, int iq) {
        super(name, surname, year, iq, new String[][]{}, null);
    }

    public Woman(String name, String surname, int year, int iq, String[][] schedule) {
        super(name, surname, year, iq, schedule, null);
    }

    public Woman(String name, String surname, int year, int iq, String[][] schedule, Family family) {
        super(name, surname, year, iq, schedule, family);
    }

    public void makeup() {
        System.out.println("MakeUp");
    }

    public void greetPet(Pet pet) {
        System.out.println("Hello my beauty, " + pet.getNickname());
    }
}
