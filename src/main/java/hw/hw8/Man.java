package hw.hw8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Man extends Human {

    public Man() {
        super("", "", 0, 0, new HashMap<>(), null);
    }

    public Man(String name, String surname, int year) {
        super(name, surname, year, 0, new HashMap<>(), null);
    }

    public Man(String name, String surname, int year, int iq) {
        super(name, surname, year, iq, new HashMap<>(), null);
    }

    public Man(String name, String surname, int year, int iq, Map<DayOfWeek, List<String>> schedule) {
        super(name, surname, year, iq, schedule, null);
    }

    public Man(String name, String surname, int year, int iq, Map<DayOfWeek, List<String>> schedule, Family family) {
        super(name, surname, year, iq, schedule, family);
    }

    public void repairCar() {
        System.out.println("Lets Repair My Car");
    }

    public void greetPet(Pet pet) {
        System.out.println("Hey, " + pet.getNickname());
    }
}
