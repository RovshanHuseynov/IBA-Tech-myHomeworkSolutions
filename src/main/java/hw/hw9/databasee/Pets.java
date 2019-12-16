package hw.hw9.databasee;

import hw.hw9.entity.Dog;
import hw.hw9.entity.DomesticCat;
import hw.hw9.entity.Pet;
import hw.hw9.enumm.Species;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Pets {
    Pet dog1 = new Dog(Species.DOG, "Ares");
    Pet cat1 = new DomesticCat(Species.DOMESTIC_CAT, "Luna", 2, 30, new HashSet<>(Arrays.asList("jump", "lick", "sleep")));
    Pet dog2 = new Dog(Species.DOG, "Zeus", 3, 20, new HashSet<>(Arrays.asList("bark", "run fast", "smell well")));
    Pet cat2 = new DomesticCat(Species.DOMESTIC_CAT, "Luna", 2, 30, new HashSet<>(Arrays.asList("jump", "lick", "sleep")));
    Pet dog3 = new Dog(Species.DOG, "Boro", 1, 35, new HashSet<>(Arrays.asList("run fast", "chase people", "find drugs")));

    public List<Pet> create(){
        List<Pet> pets = Arrays.asList(dog1, cat1, dog2, cat2, dog3);
        return pets;
    }
}