package hw.hw8;

import java.util.ArrayList;
import java.util.List;

public final class Man extends Human {

    public Man() {
        super("", "", 0, 0, new ArrayList<>(), null);
    }

    public Man(String name, String surname, int year) {
        super(name, surname, year, 0, new ArrayList<>(), null);
    }

    public Man(String name, String surname, int year, int iq) {
        super(name, surname, year, iq, new ArrayList<>(), null);
    }

    public Man(String name, String surname, int year, int iq, List<List<String>> schedule) {
        super(name, surname, year, iq, schedule, null);
    }

    public Man(String name, String surname, int year, int iq, List<List<String>> schedule, Family family) {
        super(name, surname, year, iq, schedule, family);
    }

    public void repairCar() {
        System.out.println("MakeUp");
    }

    public void greetPet(AbstractPet pet) {
        System.out.println("Hey, " + pet.getNickname());
    }
}
