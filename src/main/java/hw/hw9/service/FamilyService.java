package hw.hw9.service;

import hw.hw9.dao.CollectionFamilyDao;
import hw.hw9.dao.FamilyDao;
import hw.hw9.databasee.Database;
import hw.hw9.entity.Family;
import java.util.List;
import java.util.function.Consumer;

public class FamilyService {
    private final FamilyDao familyDao;

    public FamilyService(Database db) {
        this.familyDao = new CollectionFamilyDao(db);
    }

    public void getAllFamilies(){
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
