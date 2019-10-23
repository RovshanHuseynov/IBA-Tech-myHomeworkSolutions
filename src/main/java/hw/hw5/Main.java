package hw.hw5;

public class Main {
    public static void main(String[] args) {
        Pet myDog1 = new Pet("dog","Ares", 1, 60, new String[]{"bark", "jump", "follow you"});
        Pet myCat1 = new Pet("cat", "Luna", 2,30, new String[]{"jump", "lick", "sleep"});
        Pet myDog2 = new Pet("dog","Zeus", 3, 20, new String[]{"bark","run fast","smell well"});

        Human family1Mother1 = new Human("Sevinc", "Huseynova" ,1967);
        Human family1Father1 = new Human("Mirze", "Quliyev", 1965);
        Human family1Child1 = new Human("Rovshan","Huseynov", 1994);
        Human family1Child2 = new Human("Sabina", "Quluzade", 1993);
        Human family1Child3 = new Human("Kamil", "Eliyev", 1997);
        Human family1Child4 = new Human("Elekber", "Soltanli", 1990);
        Human family1Child5 = new Human("Ramin", "Orucov" , 1980);

        //Family f1 = new Family();

        /*
        Pet myDog1 = new Pet();
        Pet myCat1 = new Pet();
        Pet myDog2 = new Pet("dog","Ares");
        Pet myCat2 = new Pet("cat", "Luna", 1,30, new String[]{"jump", "lick", "sleep"});
        Pet myDog3 = new Pet("dog","Zeus", 2, 20, new String[]{"bark","run fast","smell well"});

        myDog1.eat();
        myCat1.eat();
        myDog2.foul();
        myDog2.respond();
        System.out.println(myCat2.toString());

        Human human1 = new Human();
        Human human2 = new Human("Sevinc", "Huseynova" ,1967);
        Human human3 = new Human("Mirze", "Quliyev", 1965);
        Human human4 = new Human("Rovshan","Huseynov", 1994, human3 ,human2);
        Human human5 = new Human("Sabina", "Quluzade", 1993, 60, myDog2, human3, human2);
        Human human6 = new Human("Kamil", "Eliyev", 1997, 80, myCat2, human3, human2);
        Human human7 = new Human("Elekber", "Soltanli", 1990, 90, myCat2, human3, human2);
        Human human8 = new Human("Ramin", "Orucov" , 1980 , 80, myDog3 , human3 , human2);

        human5.greetPet();
        human6.describePet();
        System.out.println(human7.toString());
        boolean isFeed = human8.feedPet();
         */
    }
}
