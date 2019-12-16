package hw.hw9.databasee;

import hw.hw9.entity.Family;
import hw.hw9.entity.Human;
import hw.hw9.entity.Pet;

import java.util.List;

public class Database {
    private List<Family> families;
    private List<Human> humans;
    private List<Pet> pets;

    public Database() {
        create();
    }

    public void create(){
        families = new Families().create();
        humans = new Humans().create();
        pets = new Pets().create();
    }

    public List<Family> getFamilies() {
        return families;
    }

    public List<Human> getHumans() {
        return humans;
    }

    public List<Pet> getPets() {
        return pets;
    }
}
