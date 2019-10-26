package hw.hw7;

public class Main {
    public static void main(String[] args) {
        Pet myDog1 = new Pet("dog", "Ares", 1, 60, new String[]{"bark", "jump", "follow you"});
        Pet myCat1 = new Pet("cat", "Luna", 2, 30, new String[]{"jump", "lick", "sleep"});
        Pet myDog2 = new Pet("dog", "Zeus", 3, 20, new String[]{"bark", "run fast", "smell well"});
        Pet myCat2 = new Pet("cat", "Luna", 2, 30, new String[]{"jump", "lick", "sleep"});
        System.out.println("hashCode(myCat1, myCat2): " + (myCat1.hashCode() == myCat2.hashCode()));

        Human family1Mother = new Human("Sevinc", "Huseynova", 1967, 80, new String[][]{{"Monday", "go shopping"}});
        Human family1Father = new Human("Mirze", "Huseynov", 1965, 90);
        Human family1Child1 = new Human("Rovshan", "Huseynov", 1994);
        Human family1Child2 = new Human("Sabina", "Huseynova", 1993);
        Human family1Child3 = new Human("Kamil", "Huseynov", 1997);
        Human family1Child4 = new Human("Elekber", "Huseynov", 1990, 90, new String[][]{{"Monday", "do homework"}, {"Sunday", "have a rest"}});
        Human family1Child5 = new Human("Ramin", "Huseynov", 1980, 80, new String[][]{{"Monday", "do homework"}, {"Sunday", "have a rest"}});
        Human family1Child6 = new Human("Ramin", "Huseynov", 1980, 80, new String[][]{{"Monday", "do homework"}, {"Sunday", "have a rest"}});
        Human family1Child7 = new Human("Ramin", "Huseynov", 1980, 80, new String[][]{{"Monday", "do homework"}, {"Tuesday", "read books"}, {"Sunday", "have a rest"}});
        Human family1Child8 = new Human("Ramin", "Huseynov", 1980, 80, new String[][]{{"Monday", "sleep"}, {"Tuesday", "read books"}, {"Sunday", "have a rest"}});
        System.out.println("hashCode(family1Child1, family1Child2): " + (family1Child1.hashCode() == family1Child2.hashCode()));


        System.out.println("equals(family1Mother, family1Father): " + family1Mother.equals(family1Father));
        System.out.println("equals(family1Child4, family1Child5): " + family1Child4.equals(family1Child5));
        System.out.println("equals(family1Child5, family1Child6): " + family1Child5.equals(family1Child6));
        System.out.println("equals(family1Child6, family1Child7): " + family1Child6.equals(family1Child7));
        System.out.println("equals(family1Child7, family1Child8): " + family1Child7.equals(family1Child8));
        System.out.println("equals(myDog1, myCat1): " + myDog1.equals(myCat1));
        System.out.println("equals(myCat1, myCat2): " + myCat1.equals(myCat2));

        Family f1 = new Family(family1Mother, family1Father);
        System.out.println(f1.toString());
        f1.countFamily();
        f1.addChild(family1Child1);
        f1.addChild(family1Child2);
        f1.addChild(family1Child3);
        f1.addChild(family1Child4);
        f1.addChild(family1Child5);
        f1.countFamily();
        System.out.println(f1.toString());
        System.out.println(f1.getChildren()[4].toString());

        f1.deleteChild(0);
        f1.deleteChild(6);

        System.out.println(f1.getChildren()[0].toString());
        f1.deleteChild(0);

        f1.countFamily();
        f1.deleteChild(0);

        f1.countFamily();
        f1.deleteChild(0);

        f1.countFamily();
        f1.deleteChild(0);

        f1.countFamily();
        f1.deleteChild(0);
        f1.countFamily();

        f1.addChild(family1Child1);
        f1.countFamily();

        f1.setPet(myDog1);
        //f1.addPet(myDog1);
        System.out.println(f1.toString());


        System.out.println("---------------------------------");
        Human family2Mother = new Human("Ayise", "Agayeva", 1950);
        Human family2Father = new Human("Samir", "Agayev", 1945);
        Human family2Child1 = new Human("Amil", "Agayev", 1964);
        Human family2Child2 = new Human("Selim", "Agayev", 1970);

        Family f2 = new Family(family2Mother, family2Father);
        f2.addChild(family2Child1);
        f2.addChild(family2Child2);
        f2.setPet(myDog2);
        //f2.addPet(myDog2);
        f2.countFamily();
        System.out.println(f2.toString());


        System.out.println("---------------------------------");
        Human family3Mother = new Human("Lale", "Melikova", 1950);
        Human family3Father = new Human("Zamiq", "Melikov", 1945);
        Human family3Child1 = new Human("Suqra", "Melikova", 1964);
        Human family3Child2 = new Human("Nergiz", "Melikova", 1970);

        Family f3 = new Family(family3Mother, family3Father);
        f3.addChild(family1Child7);
        f3.addChild(family3Child2);
        f3.setPet(myCat1);
        //f3.addPet(myCat1);
        System.out.println(f3.getPet().toString());
        f3.countFamily();
        f3.deleteChild(1);
        f3.countFamily();
        System.out.println(f3.toString());

        f3.getPet().eat();
        f3.getPet().respond();
        f3.getPet().foul();
        System.out.println(f3.getPet().toString());
        f3.greetPet();
        f3.describePet();
        boolean isFeed = f3.feedPet();
        System.out.println("Did the family feed their pet? --> " + isFeed);

        Family f4 = new Family(family3Mother, family3Father);
        f4.addChild(family1Child7);
        f4.setPet(myCat1);

        System.out.println("hashCode(f1, f2): " + (f1.hashCode() == f2.hashCode()));
        System.out.println("equals(f1, f2): " + f1.equals(f2));
        System.out.println("equals(f3, f4): " + f3.equals(f4));
    }
}
