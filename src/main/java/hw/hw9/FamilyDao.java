package hw.hw9;

import java.util.List;

public interface FamilyDao {
    public List<Family> getAllFamilies();
    public Family getFamilyByIndex(int index);
    public boolean deleteFamily(int index);
    public boolean deleteFamily(Family family);
    public void saveFamily(Family family);
}