package hw.hw5;

import java.util.Random;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private int countChildren;
    private Pet pet;
    private int countPet;

    public Family(Human mother, Human father) {    // constructor
        this.mother = mother;
        this.father = father;
        this.children = new Human[10];
        this.countChildren = 0;
        this.pet = new Pet();
    }

    @Override
    public String toString() {
        String s = "Family{" + "mother=" + mother + ", father=" + father + ", children=[";

        if (countChildren > 0) {
            for (int i = 0; i < countChildren; i++) {
                s += "[" + children[i].toString() + "]";
            }
        }
        s += ", pet=[";

        if (countPet > 0) {
            s += pet.toString();
        }
        s += "]]}";
        return s;
    }

    public void deleteChild(int index) {
        if (index < countChildren) {
            System.out.print(children[index].getName() + " " + children[index].getSurname() + " Deleted.");
            Human[] temp = new Human[10];
            int countTemp = 0;

            for (int i = 0; i < countChildren; i++) {
                if (i == index) {
                    continue;
                } else {
                    temp[countTemp++] = children[i];
                }
            }

            children = temp;
            countChildren--;
        } else {
            System.out.print("Not Deleted.");
        }
        System.out.println(" Count Children: " + countChildren);
    }

    public void addChild(Human child) {
        children[countChildren] = child;
        countChildren++;
        System.out.println("New Child Added! Count children: " + countChildren);
    }

    public void addPet(Pet p) {
        this.pet = p;
        countPet++;
        System.out.println("New Pet Added!");
    }

    public void countFamily() {
        int cnt = 2 + countChildren;
        System.out.println("Count Family: " + cnt);
    }       // count number of members of a family

    public boolean feedPet() {
        System.out.println("isn't it time for feeding?");
        Random random = new Random();
        int x = random.nextInt(100);

        if (x < pet.getTrickLevel()) {
            System.out.println("I think " + pet.getNickname() + " is not hungry.");
            return false;
        } else {
            System.out.println("Hm... I will feed " + pet.getNickname() + "'s");
            return true;
        }
    }

    public void greetPet() {
        System.out.println("Hello, " + pet.getNickname());
    }

    public void describePet() {
        String trickLevel = pet.getTrickLevel() > 50 ? "very sly" : "almost not sly";
        System.out.println("I have a " + pet.getSpecies() + ", he is " + pet.getAge() + " years old, he is " + trickLevel);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        else if (this == obj) return true;
        else if (!(obj instanceof Family)) return false;

        Family that = (Family) obj;
        if (this.father.toString().equals(that.father.toString()) && this.mother.toString().equals(that.mother.toString())
                && this.pet.toString().equals(that.pet.toString()) && this.countChildren == that.countChildren) {
            for (int i = 0; i < countChildren; i++) {
                if (!this.children[i].toString().equals(that.children[i].toString())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
        countPet++;
    }
}
