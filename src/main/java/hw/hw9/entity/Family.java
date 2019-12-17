package hw.hw9.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Family {
    private int index;
    private Human mother;
    private Human father;
    private List<Human> children;
    private Set<Pet> pet;

    public Family(int index, Human mother, Human father) {
        this.index = index;
        this.mother = mother;
        this.father = father;
        this.children = new ArrayList<>();
        this.pet = new HashSet<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Family{ mother=");
        sb.append(mother);
        sb.append(", father=");
        sb.append(father);
        sb.append(", children=");

        if (children.size() > 0) {
            for (int i = 0; i < children.size() - 1; i++) {
                sb.append(children.get(i).toString());
                sb.append(", ");
            }
            sb.append(children.get(children.size() - 1).toString());
        } else {
            sb.append("{}");
        }
        sb.append(", pet=");

        if (pet.size() > 0) {
            for (Pet p : pet) {
                sb.append("[");
                sb.append(p.toString());
                sb.append("]");
            }
        } else {
            sb.append("{}");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        else if (!(obj instanceof Family)) return false;
        else if (this == obj) return true;

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

    public int getIndex() {
        return index;
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
