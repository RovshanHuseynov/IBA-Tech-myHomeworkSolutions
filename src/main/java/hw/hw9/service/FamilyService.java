package hw.hw9.service;

import hw.hw9.dao.FamilyDao;
import hw.hw9.databasee.Database;
import hw.hw9.entity.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class FamilyService {
    private final FamilyDao familyDao;

    public FamilyService(FamilyDao familyDao) {
        this.familyDao = familyDao;
    }

    public List<Family> getAllFamilies() {
        return familyDao.getAllFamilies();
    }

    public void displayAllFamilies() {
        List<Family> families = getAllFamilies();
        for (Family f : families) {
            System.out.println(f.toString());
        }
    }

    public List<Family> getFamiliesBiggerThan(int number) {
        List<Family> res = new ArrayList<>();
        List<Family> families = getAllFamilies();
        for (Family family : families) {
            if (family.countFamily() > number) {
                res.add(family);
            }
        }
        return res;
    }

    public List<Family> getFamiliesLessThan(int number) {
        List<Family> res = new ArrayList<>();
        List<Family> families = getAllFamilies();
        for (Family family : families) {
            if (family.countFamily() < number) {
                res.add(family);
            }
        }
        return res;
    }

    public List<Family> countFamiliesWithMemberNumber(int number) {
        List<Family> res = new ArrayList<>();
        List<Family> families = getAllFamilies();
        for (Family family : families) {
            if (family.countFamily() == number) {
                res.add(family);
            }
        }
        return res;
    }

    public void createNewFamily(Human mother, Human father) {
        int max = 0;
        List<Family> families = getAllFamilies();
        for (Family family : families) {
            max = Math.max(family.getIndex(), max);
        }
        Family family = new Family(max + 1, mother, father);
        familyDao.saveFamily(family);
    }

    public boolean deleteFamilyByIndex(int index) {
        List<Family> families = getAllFamilies();
        for (Family family : families) {
            if (family.getIndex() == index) {
                return familyDao.deleteFamily(family);
            }
        }
        return false;
    }

    public void bornChild(Family family, String gender) {
        String[] womanNames = {"Lale", "Kemale", "Fidan", "Nergiz", "Sunbul", "Lamiye", "Aydan"};
        String[] manNames = {"Samir", "Amil", "Kamil", "Letif", "Eli", "Arif", "Ehed"};
        Random random = new Random();
        String childName = "";
        String childSurname = family.getFather().getSurname();
        int childIq = (family.getFather().getIq() + family.getMother().getIq()) / 2;
        Human bornChild = null;
        if (gender.equals("feminine")) {
            childName = womanNames[random.nextInt(7)];
            bornChild = new Woman(childName, childSurname, 1990, childIq);
        } else if (gender.equals("masculine")) {
            childName = manNames[random.nextInt(7)];
            bornChild = new Man(childName, childSurname, 1990, childIq);
        }
        familyDao.deleteFamily(family);
        family.addChild(bornChild);
        familyDao.saveFamily(family);
    }

    public Family adoptChild(Family family, Human human) {
        familyDao.deleteFamily(family);
        family.addChild(human);
        familyDao.saveFamily(family);
        return family;
    }

    public void deleteAllChildrenOlderThen(int age) {
        List<Family> families = getAllFamilies();
        for (Family family : families) {
            familyDao.deleteFamily(family);
            for (Human child : family.getChildren()) {
                if (LocalDate.now().getYear() - child.getYear() > age) {
                    family.deleteChild(child);
                }
            }
            familyDao.saveFamily(family);
        }
    }

    public int count() {
        return familyDao.getAllFamilies().size();
    }

    public Family getFamilyById(int index) {
        List<Family> families = getAllFamilies();
        for (Family family : families) {
            if (family.getIndex() == index) {
                return family;
            }
        }
        return null;
    }

    public Set<Pet> getPets(int index) {
        List<Family> families = getAllFamilies();
        for (Family family : families) {
            if (family.getIndex() == index) {
                return family.getPet();
            }
        }
        return null;
    }

    public void addPet(int index, Pet pet) {
        List<Family> families = getAllFamilies();
        for (Family family : families) {
            if (family.getIndex() == index) {
                familyDao.deleteFamily(family);
                family.addPet(pet);
                familyDao.saveFamily(family);
            }
        }
    }
}
