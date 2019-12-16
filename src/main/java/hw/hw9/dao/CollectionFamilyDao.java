package hw.hw9.dao;

import hw.hw9.databasee.Database;
import hw.hw9.entity.Family;

import java.util.List;

public class CollectionFamilyDao implements FamilyDao {
    private final List<Family> families;

    public CollectionFamilyDao(Database db) {
        this.families = db.getFamilies();
    }

    @Override
    public List<Family> getAllFamilies() {
        return families;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        for (Family f : families) {
            if (f.getIndex() == index) {
                return f;
            }
        }
        return null;
    }

    @Override
    public boolean deleteFamily(int index) {
        for (Family f : families) {
            if (f.getIndex() == index) {
                return families.remove(f);
            }
        }
        return false;
    }

    @Override
    public boolean deleteFamily(Family family) {
        if (families.contains(family)) {
            return families.remove(family);
        }
        /*
        for (Family f : families) {
            if (f.getIndex() == family.getIndex() &&
                    f.getFather().equals(family.getFather()) &&
                    f.getMother().equals(family.getMother()) &&
                    f.getPet().equals(family.getPet()) &&
                    f.getChildren().equals(family.getChildren())) {
                families.remove(family);
            }
        }
        */
        return false;
    }

    @Override
    public void saveFamily(Family family) {
        if (isFamilyExist(family)) {
            //update an existing family in List<Family>
        } else {
            // save at the end of the list
        }
    }

    @Override
    public boolean isFamilyExist(Family family) {
        return false;
    }
}