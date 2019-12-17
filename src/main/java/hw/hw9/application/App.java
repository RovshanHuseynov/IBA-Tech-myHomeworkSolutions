package hw.hw9.application;

import hw.hw9.controller.FamilyController;
import hw.hw9.dao.CollectionFamilyDao;
import hw.hw9.dao.FamilyDao;
import hw.hw9.databasee.Database;
import hw.hw9.service.FamilyService;

public class App {
    public static void main(String[] args) {
        Database database = new Database();
        FamilyDao familyDao = new CollectionFamilyDao(database);
        FamilyService familyService = new FamilyService(familyDao);
        FamilyController familyController = new FamilyController(familyService);
        System.out.println(familyController.getAllFamilies().size());
        familyController.displayAllFamilies();
        System.out.println("Hello");
    }
}