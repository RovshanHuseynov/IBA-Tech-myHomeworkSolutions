package hw.hw5;

import java.util.Arrays;

public class Family {
    Human mother;
    Human father;
    Human[] children;
    Pet pet;

    public Family(Human mother, Human father) {    // constructor
        this.mother = mother;
        this.father = father;
        this.children = new Human[]{};
        //this.pet = ????
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

    public boolean deleteChild(int index){
        System.out.println("children.length: " + children.length);
        if(index < children.length){
            Human [] temp = new Human[children.length-1];
            int j=0;
            for(int i=0; i<temp.length; i++){
                if(j == index){
                    continue;
                }
                else{
                    temp[i] = children[j];
                    j++;
                }
            }

            children = temp;
            return true;
        }
        else{
            return  false;
        }
    }

    public void addChild(Human child){
        System.out.println("children.length:" + children.length);
        children[children.length] = child;
    }

    public int countFamily(){
        return 2 + children.length;
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
