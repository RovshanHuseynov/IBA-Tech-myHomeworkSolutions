package hw.hw9.service;

import hw.hw9.dao.FamilyDao;
import hw.hw9.entity.Family;

import java.util.List;
import java.util.function.Consumer;

public class FamilyService {
    private FamilyDao familyDao;

    public List<Family> getAllFamilies() {
        return familyDao.getAllFamilies();
    }

    public void displayAllFamilies() {
        familyDao.getAllFamilies().forEach(new Consumer<Family>() {
            @Override
            public void accept(Family family) {
                System.out.println("------------------------------");
                System.out.println("mother --> " + family.getMother().toString());
                System.out.println("father --> " + family.getFather().toString());

                for (int i = 0; i < family.getChildren().size(); i++) {
                    System.out.println(i + ". children --> " + family.getChildren().get(i).toString());
                }
            }
        });
    }
}
