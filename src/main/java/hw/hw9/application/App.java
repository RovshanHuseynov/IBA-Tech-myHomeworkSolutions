package hw.hw9.application;

import hw.hw9.controller.FamilyController;
import hw.hw9.databasee.Database;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello");
        Database db = new Database();
        FamilyController fc = new FamilyController(db);
    }
}