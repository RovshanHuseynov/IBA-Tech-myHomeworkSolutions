package hw.hw5;

public class Main {
    public static void main(String[] args) {
        Pet myDog1 = new Pet();
        Pet myCat1 = new Pet();
        Pet myDog2 = new Pet("dog","Ares");
        Pet myCat2 = new Pet("cat", "Luna", 1,30, new String[]{"jump", "lick", "sleep"});
        Pet myDog3 = new Pet("dog","Zeus", 2, 20, new String[]{"bark","run fast","smell well"});

        myDog1.eat();
        myCat1.eat();
        myDog2.foul();
        myDog2.respond(myDog2);
        System.out.println(myCat2.toString());
/*
        Human human1 = new Human();
        Human human2 = new Human("Sevinc", "Huseynova" ,1967);
        Human human3 = new Human("Mirze", "Quliyev", 1965);
        Human human4 = new Human("Rovshan","Huseynov", 1994, human3 ,human2);
        Human human5 = new Human("Sabina", "Quluzade", 1993, 60, myDog2, human3, human2);
        Human human6 = new Human("Kamil", "Eliyev", 1997, 80, myCat2, human3, human2);
        Human human7 = new Human("Elekber", "Soltanli", 1990, 90, myCat2, human3, human2);
        Human human8 = new Human("Ramin", "Orucov" , 1980 , 80, myDog3 , human3 , human2);

        human5.greetPet(human5);
        human6.describePet(human6);
        System.out.println(human7.toString());
        boolean isFeed = human8.feedPet(human8);
*/
    }
}
