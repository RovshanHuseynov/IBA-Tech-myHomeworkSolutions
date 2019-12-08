package hw.hw9.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Family {
    private Human mother;
    private Human father;
    private List<Human> children;
    private Set<Pet> pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new ArrayList<>();
        this.pet = new HashSet<>();
    }

    @Override
    protected void finalize() {
        System.out.println("Removal of Unnecessary Objects");
    }

    @Override
    public String toString() {
        String s = "Family{" + "mother=" + getMother() + ", father=" + getFather() + ", children=";

        if (children.size() > 0) {
            for (int i = 0; i < children.size() - 1; i++) {
                s += children.get(i).toString() + ", ";
            }
            s += children.get(children.size() - 1).toString();
        } else {
            s += "{}";
        }
        s += ", pet=";

        if (pet.size() > 0) {
            for (Pet item : pet) {
                s += "[" + item.toString() + "]";
            }
        } else {
            s += "{}";
        }
        s += "}";
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        else if (this == obj) return true;
        else if (!(obj instanceof Family)) return false;

        Family that = (Family) obj;
        if (this.children.size() == that.children.size()
                && this.getFather().toString().equals(that.getFather().toString())
                && this.getMother().toString().equals(that.getMother().toString())
                && this.getPet().toString().equals(that.getPet().toString())
                && this.children.toString().equals(that.children.toString())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int r = children.size();
        r = r * 31 + pet.size();
        r = r * 31 + getMother().hashCode();
        r = r * 31 + getFather().hashCode();
        r = r * 31 + getPet().hashCode();
        return r;
    }

    public void addChild(Human child) {
        children.add(child);
        child.setFamily(this);
    }

    public void addPet(Pet pet) {
        this.pet.add(pet);
    }

    public boolean deleteChild(int index) {
        if (index < children.size()) {
            children.remove(children.get(index));
            return true;
        }
        return false;
    }

    public boolean deleteChild(Human child) {
        for (int i = 0; i < children.size(); i++) {
            if (children.get(i).hashCode() == child.hashCode() && children.get(i).equals(child)) {
                return deleteChild(i);
            }
        }
        return false;
    }

    public int countFamily() {
        return 2 + children.size();
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public List<Human> getChildren() {
        return children;
    }

    public Set<Pet> getPet() {
        return pet;
    }
}
