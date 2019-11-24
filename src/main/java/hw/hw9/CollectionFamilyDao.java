package hw.hw9;

import java.util.List;

public class CollectionFamilyDao implements FamilyDao {
    private List<Family> family;

    @Override
    public List<Family> getAllFamilies() {
        return family;
    }

    @Override
    public Family getFamilyByIndex(int index) {
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
    }
}
