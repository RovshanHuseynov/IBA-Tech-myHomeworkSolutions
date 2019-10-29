package hw.hw5;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private int countChildren;
    private Pet pet;
    private int countPet;

    public Family(Human mother, Human father) {    // constructor
        this(mother, father, new Human[]{}, new Pet());
    }

    public Family(Human mother, Human father, Human[] children, Pet pet) {    // constructor
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.countChildren = 0;
        this.pet = pet;
        this.countPet = 0;
    }

    @Override
    public String toString() {
        String s = "Family{" + "mother=" + getMother() + ", father=" + getFather() + ", children=[";

        if (getCountChildren() > 0) {
            for (int i = 0; i < getCountChildren(); i++) {
                s += "[" + getChildren()[i].toString() + "]";
            }
        }
        s += ", pet=[";

        if (getCountPet() > 0) {
            s += getPet().toString();
        }
        s += "]]}";
        return s;
    }

    public void deleteChild(int index) {
        if (index < getCountChildren()) {
            System.out.print(getChildren()[index].getName() + " " + getChildren()[index].getSurname() + " Deleted.");
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
        } else {
            System.out.print("Not Deleted.");
        }
        System.out.println(" Count Children: " + getCountChildren());
    }

    public void addChild(Human child) {
        getChildren()[getCountChildren()] = child;
        countChildren++;
        System.out.println("New Child Added! Count children: " + getCountChildren());
    }

    public void addPet(Pet p) {
        this.pet = p;
        countPet = 1;
        System.out.println("New Pet Added!");
    }

    public void countFamily() {
        int cnt = 2 + getCountChildren();
        System.out.println("Count Family: " + cnt);
    }       // count number of members of a family

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

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        else if (this == obj) return true;
        else if (!(obj instanceof Family)) return false;

        Family that = (Family) obj;
        if (this.getCountChildren() == that.getCountChildren() && this.getFather().toString().equals(that.getFather().toString())
                && this.getMother().toString().equals(that.getMother().toString()) && this.getPet().toString().equals(that.getPet().toString())) {
            for (int i = 0; i < getCountChildren(); i++) {
                if (!this.getChildren()[i].toString().equals(that.getChildren()[i].toString())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getMother(), getFather(), getCountChildren(), getPet(), getCountPet());
        result = 31 * result + Arrays.hashCode(getChildren());
        return result;
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
