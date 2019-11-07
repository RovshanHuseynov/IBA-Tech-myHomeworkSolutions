package hw.hw7;

import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private int countChildren;
    private AbstractPet pet;
    private int countPet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[10];
        this.countChildren = 0;
        this.pet = null;
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
                s += children[i].toString() + ", ";
            }
            s += children[getCountChildren() - 1].toString();
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
        if (obj == null) return false;
        else if (this == obj) return true;
        else if (!(obj instanceof Family)) return false;

        if (this.hashCode() != obj.hashCode()) {
            return false;
        }

        Family that = (Family) obj;
        if (this.getCountChildren() == that.getCountChildren() && this.getFather().toString().equals(that.getFather().toString())
                && this.getMother().toString().equals(that.getMother().toString()) && this.getPet().toString().equals(that.getPet().toString())
                && Arrays.equals(this.children, that.children)) {
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

    public void addChild(Human child) {
        children[getCountChildren()] = child;
        setCountChildren(getCountChildren() + 1);
        child.setFamily(this);
    }

    public void addPet(AbstractPet pet) {
        this.pet = pet;
        setCountPet(getCountPet() + 1);
    }

    public boolean deleteChild(int index) {
        if (index < getCountChildren()) {
            children[index].setFamily(null);
            Human[] temp = new Human[10];
            int countTemp = 0;

            for (int i = 0; i < getCountChildren(); i++) {
                if (i == index) {
                    continue;
                } else {
                    temp[countTemp++] = children[i];
                }
            }

            children = temp;
            countChildren--;
            return true;
        }
        return false;
    }

    public boolean deleteChild(Human child) {
        for (int i = 0; i < getCountChildren(); i++) {
            if (children[i].hashCode() == child.hashCode() && children[i].equals(child)) {
                return deleteChild(i);
            }
        }
        return false;
    }

    public int countFamily() {
        return 2 + getCountChildren();
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

    public AbstractPet getPet() {
        return pet;
    }

    public int getCountChildren() {
        return countChildren;
    }

    public int getCountPet() {
        return countPet;
    }
}
