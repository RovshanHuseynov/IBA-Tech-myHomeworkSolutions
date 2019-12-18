package hw.hw9.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Family {
    private int id;
    private Human mother;
    private Human father;
    private List<Human> children;
    private Set<Pet> pets;

    public Family(int id, Human mother, Human father) {
        this.id = id;
        this.mother = mother;
        this.father = father;
        this.children = new ArrayList<>();
        this.pets = new HashSet<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Family{ id=");
        sb.append(id);
        sb.append(", mother=");
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

        if (pets.size() > 0) {
            for (Pet p : pets) {
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
        if (this.id == that.id
                && this.children.size() == that.children.size()
                && this.pets.size() == that.pets.size()
                && this.mother.toString().equals(that.mother.toString())
                && this.father.toString().equals(that.father.toString())
                && this.pets.toString().equals(that.pets.toString())
                && this.children.toString().equals(that.children.toString())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int r = id;
        r = r * 31 + children.size();
        r = r * 31 + pets.size();
        r = r * 31 + mother.hashCode();
        r = r * 31 + father.hashCode();
        r = r * 31 + pets.hashCode();
        r = r * 31 + children.hashCode();
        return r;
    }

    public void addChild(Human child) {
        children.add(child);
        child.setFamily(this);
    }

    public void addPet(Pet pet) {
        pets.add(pet);
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

    public int countChildren() {
        return children.size();
    }

    public int countFamily() {
        return 2 + countChildren();
    }

    public int getId() {
        return id;
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

    public Set<Pet> getPets() {
        return pets;
    }
}
