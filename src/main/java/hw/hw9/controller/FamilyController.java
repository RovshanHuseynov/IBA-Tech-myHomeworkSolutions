package hw.hw9.controller;

import hw.hw9.databasee.Database;
import hw.hw9.service.FamilyService;

public class FamilyController {
    private final FamilyService familyService;

    public FamilyController(Database db) {
        this.familyService = new FamilyService(db);
    }

    public void getAllFamilies() {
    }

    public void displayAllFamilies() {
    }

    public void getFamiliesBiggerThan() {
    }

    public void getFamiliesLessThan() {
    }

    public void countFamiliesWithMemberNumber() {
    }

    public void createNewFamily() {
    }

    public void deleteFamilyByIndex() {
    }

    public void bornChild() {
    }

    public void adoptChild() {
    }

    public void deleteAllChildrenOlderThen() {
    }

    public void count() {
    }

    public void getFamilyById() {
    }

    public void getPets() {
    }

    public void addPet() {
    }
}
