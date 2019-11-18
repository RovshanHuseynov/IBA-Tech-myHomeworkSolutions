package hw.hw8;

import java.util.ArrayList;
import java.util.List;

public final class Woman extends Human {

    public Woman() {
        super("", "", 0, 0, new ArrayList<>(), null);
    }

    public Woman(String name, String surname, int year) {
        super(name, surname, year, 0, new ArrayList<>(), null);
    }

    public Woman(String name, String surname, int year, int iq) {
        super(name, surname, year, iq, new ArrayList<>(), null);
    }

    public Woman(String name, String surname, int year, int iq, List<List<String>> schedule) {
        super(name, surname, year, iq, schedule, null);
    }

    public Woman(String name, String surname, int year, int iq, List<List<String>> schedule, Family family) {
        super(name, surname, year, iq, schedule, family);
    }

    public void makeup() {
        System.out.println("MakeUp");
    }

    public void greetPet(AbstractPet pet) {
        System.out.println("Hello my beauty, " + pet.getNickname());
    }
}
