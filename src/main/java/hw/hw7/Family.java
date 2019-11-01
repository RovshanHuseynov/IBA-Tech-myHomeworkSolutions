package hw.hw7;

import java.util.Arrays;
import java.util.Random;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private int countChildren;
    private Pet pet;
    private int countPet;

    public Family(Human mother, Human father) {    // constructor
        this(mother, father, new Human[10], new Pet());
    }

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.countChildren = 0;
        this.pet = pet;
        this.countPet = 0;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Removal of Unnecessary Objects");
    }

    @Override
    public String toString() {
        String s = "Family{" + "mother=" + getMother() + ", father=" + getFather() + ", children=";

        if (getCountChildren() > 0) {
            for (int i = 0; i < getCountChildren() - 1; i++) {
                s += getChildren()[i].toString() + ", ";
            }
            s += getChildren()[getCountChildren() - 1].toString();
        } else {
            s += "{}";
        }
        s += ", pet=";

        if (getCountPet() > 0) {
            s += getPet().toString();
        } else {
            s += "{}";
        }
        s += "}";
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.hashCode() != obj.hashCode()) {
            return false;
        }

        if (obj == null) return false;
        else if (this == obj) return true;
        else if (!(obj instanceof Family)) return false;

        Family that = (Family) obj;
        if (this.getCountChildren() == that.getCountChildren() && this.getFather().toString().equals(that.getFather().toString())
                && this.getMother().toString().equals(that.getMother().toString()) && this.getPet().toString().equals(that.getPet().toString())
                && Arrays.equals(this.getChildren(), that.getChildren())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int r = getCountChildren();
        r = r * 31 + getCountPet();
        r = r * 31 + getMother().hashCode();
        r = r * 31 + getFather().hashCode();
        r = r * 31 + getPet().hashCode();
        return r;
    }

    public void deleteChildOperation(int index) {
        Human[] temp = new Human[10];
        int countTemp = 0;

        for (int i = 0; i < getCountChildren(); i++) {
            if (i == index) {
                continue;
            } else {
                temp[countTemp++] = getChildren()[i];
            }
        }

        children = temp;
        countChildren--;
    }

    public int deleteChild(Object unknownObject) {
        String className = unknownObject.getClass().getSimpleName();
        if (className.equals("Integer")) {
            if (Integer.parseInt(unknownObject.toString()) < getCountChildren()) {
                deleteChildOperation(Integer.parseInt(unknownObject.toString()));
                return 1;    // child was found and deleted
            } else {
                return 0;    // this child does not belong to this family
            }
        } else if (className.equals("Human")) {
            for (int i = 0; i < getCountChildren(); i++) {
                if (getChildren()[i].equals(unknownObject)) {
                    deleteChildOperation(i);
                    return 1;    // child was found and deleted
                }
            }
            return 0;   // this child does not belong to this family
        }

        return -1;   // Object is not equivalent to any array element. Object is not Human
    }

    public void addChild(Human child) {
        getChildren()[getCountChildren()] = child;
        setCountChildren(getCountChildren() + 1);
    }

    public void addPet(Pet p) {
        this.pet = p;
        setCountPet(getCountPet() + 1);
    }

    public int countFamily() {
        return 2 + getCountChildren();
    }

    public boolean feedPet() {
        System.out.println("isn't it time for feeding?");
        Random random = new Random();
        int x = random.nextInt(100);

        if (x < getPet().getTrickLevel()) {
            System.out.println("I think " + getPet().getNickname() + " is not hungry.");
            return false;
        } else {
            System.out.println("Hm... I will feed " + getPet().getNickname() + "'s");
            return true;
        }
    }

    public void greetPet() {
        System.out.println("Hello, " + getPet().getNickname());
    }

    public void describePet() {
        String trickLevel = getPet().getTrickLevel() > 50 ? "very sly" : "almost not sly";
        System.out.println("I have a " + getPet().getSpecies() + ", he is " + getPet().getAge() + " years old, he is " + trickLevel);
    }

    public void setCountChildren(int countChildren) {
        this.countChildren = countChildren;
    }

    public void setCountPet(int countPet) {
        this.countPet = countPet;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public Human[] getChildren() {
        return children;
    }

    public Pet getPet() {
        return pet;
    }

    public int getCountChildren() {
        return countChildren;
    }

    public int getCountPet() {
        return countPet;
    }
}
