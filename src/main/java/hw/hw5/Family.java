package hw.hw5;

import java.util.Arrays;

public class Family {
    Human mother;
    Human father;
    Human[] children;
    int countChildren;
    Pet pet;

    public Family(Human mother, Human father) {    // constructor
        this.mother = mother;
        this.father = father;
        this.children = new Human[10];
        this.countChildren = 0;
        this.pet = new Pet();
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=[" + Arrays.toString(children) +
                "]  , pet=" + pet +
                '}';
    }

    public void deleteChild(int index){
        if(index < countChildren){
            System.out.print(children[index].getName() + " " + children[index].getSurname() + " Deleted.");
            Human [] temp = new Human[10];
            int countTemp=0;

            for(int i=0; i<countChildren; i++){
                if(i == index){
                    continue;
                }
                else{
                    temp[countTemp++] = children[i];
                }
            }

            children = temp;
            countChildren--;
        }
        else{
            System.out.print("Not Deleted.");
        }
        System.out.println(" Count Children: " + countChildren);
    }

    public void addChild(Human child){
        children[countChildren] = child;
        countChildren++;
        System.out.println("New Child Added! Count children: " + countChildren);
    }

    public void addPet(Pet p){
        this.pet = p;
        System.out.println("New Pet Added!");
    }

    public void countFamily(){
        int cnt = 2 + countChildren;
        System.out.println("Count Family: " + cnt);
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
    }
}
