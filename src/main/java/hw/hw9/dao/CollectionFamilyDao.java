package hw.hw9.dao;

import hw.hw9.entity.Family;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao {
    private List<Family> family = new ArrayList<>();

    @Override
    public List<Family> getAllFamilies() {
        return family;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        if (index > family.size()) {
            return null;
        }
        return family.get(index);
    }

    @Override
    public boolean deleteFamily(int index) {
        return family.remove(family.get(index));
    }

    @Override
    public boolean deleteFamily(Family family) {
        return this.family.remove(family);
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
