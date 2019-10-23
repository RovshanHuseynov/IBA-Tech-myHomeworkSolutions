package hw.hw5;

import java.util.Arrays;
import java.util.Random;

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
    }       // count number of members of a family

    public boolean feedPet(){
        System.out.println("isn't it time for feeding?");
        Random random = new Random();
        int x = random.nextInt(100);

        if(x < pet.getTrickLevel()){
            System.out.println("I think " + pet.getNickname() + " is not hungry.");
            return false;
        }
        else{
            System.out.println("Hm... I will feed " + pet.getNickname() + "'s");
            return true;
        }
    }

    public void greetPet(){
        System.out.println("Hello, " + pet.getNickname());
    }

    public void describePet(){
        String trickLevel = pet.getTrickLevel() > 50 ? "very sly" : "almost not sly";
        System.out.println("I have a " + pet.getSpecies() + ", he is " + pet.getAge() + " years old, he is " + trickLevel);
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
