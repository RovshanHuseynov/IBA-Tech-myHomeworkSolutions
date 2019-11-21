package hw.hw8;

import java.util.*;

public class Main {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Removal of Unnecessary Objects");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            Human h = new Human();
        }

        Dog myDog1 = new Dog(Species.DOG, "Ares");
        DomesticCat myCat1 = new DomesticCat(Species.DOMESTIC_CAT, "Luna", 2, 30, new HashSet<>(Arrays.asList("jump", "lick", "sleep")));
        Dog myDog2 = new Dog(Species.DOG, "Zeus", 3, 20, new HashSet<>(Arrays.asList("bark", "run fast", "smell well")));
        DomesticCat myCat2 = new DomesticCat(Species.DOMESTIC_CAT, "Luna", 2, 30, new HashSet<>(Arrays.asList("jump", "lick", "sleep")));
        Dog myDog3 = new Dog(Species.DOG, "Boro", 1, 35, new HashSet<>(Arrays.asList("run fast", "chase people", "find drugs")));

        Human family1Mother = new Human("Sevinc", "Huseynova", 1967, 80, new HashMap<DayOfWeek, List<String>>() {{ put(DayOfWeek.MONDAY, Arrays.asList("go shopping", "take care of children")); }});
        Human family1Father = new Human("Mirze", "Huseynov", 1965, 90);
        Human family1Child1 = new Human("Rovshan", "Huseynov", 1994);
        Human family1Child2 = new Human("Sabina", "Huseynova", 1993);
        Human family1Child3 = new Human("Kamil", "Huseynov", 1997);
        Human family1Child4 = new Human("Elekber", "Huseynov", 1990, 90, new HashMap<DayOfWeek, List<String>>() {{ put(DayOfWeek.MONDAY, Arrays.asList("do homework"));put(DayOfWeek.SUNDAY, Arrays.asList("have a rest")); }});
        Human family1Child5 = new Human("Ramin", "Huseynov", 1980, 80, new HashMap<DayOfWeek, List<String>>() {{ put(DayOfWeek.MONDAY, Arrays.asList("do homework"));put(DayOfWeek.SUNDAY, Arrays.asList("have a rest")); }});
        Human family1Child6 = new Human("Ramin", "Huseynov", 1980, 80, new HashMap<DayOfWeek, List<String>>() {{ put(DayOfWeek.MONDAY, Arrays.asList("do homework"));put(DayOfWeek.SUNDAY, Arrays.asList("have a rest")); }});
        Human family1Child7 = new Human("Ramin", "Huseynov", 1980, 80, new HashMap<DayOfWeek, List<String>>() {{ put(DayOfWeek.MONDAY, Arrays.asList("do homework"));put(DayOfWeek.TUESDAY, Arrays.asList("read books"));put(DayOfWeek.SUNDAY, Arrays.asList("have a rest")); }});
        Human family1Child8 = new Human("Ramin", "Huseynov", 1980, 80, new HashMap<DayOfWeek, List<String>>() {{ put(DayOfWeek.MONDAY, Arrays.asList("sleep"));put(DayOfWeek.TUESDAY, Arrays.asList("read books"));put(DayOfWeek.SUNDAY, Arrays.asList("have a rest")); }});

        System.out.println("hashCode(family1Child1, family1Child2): " + (family1Child1.hashCode() == family1Child2.hashCode()));
        System.out.println("equals(family1Mother, family1Father): " + family1Mother.equals(family1Father));
        System.out.println("equals(family1Child4, family1Child5): " + family1Child4.equals(family1Child5));
        System.out.println("equals(family1Child5, family1Child6): " + family1Child5.equals(family1Child6));
        System.out.println("equals(family1Child6, family1Child7): " + family1Child6.equals(family1Child7));
        System.out.println("equals(family1Child7, family1Child8): " + family1Child7.equals(family1Child8));
        System.out.println("equals(myDog1, myCat1): " + myDog1.equals(myCat1));
        System.out.println("equals(myCat1, myCat2): " + myCat1.equals(myCat2));
        System.out.println("hashCode(myCat1, myCat2): " + (myCat1.hashCode() == myCat2.hashCode()));
        System.out.println(myDog1.toString());
        System.out.println(myCat1.toString());
        System.out.println(family1Mother.toString());
        System.out.println(family1Father.toString());
        System.out.println(family1Child6.toString());

        System.out.println("\n---------------- Family1 ------------------------");
        Family family1 = new Family(family1Mother, family1Father);
        family1Mother.setFamily(family1);
        family1Father.setFamily(family1);
        System.out.println(family1.toString());
        System.out.println("Count Family: " + family1.countFamily());

        family1.addChild(family1Child1);
        System.out.println("New Child Added! Family Count is: " + family1.countFamily());
        family1.addChild(family1Child2);
        System.out.println("New Child Added! Family Count is: " + family1.countFamily());
        family1.addChild(family1Child3);
        System.out.println("New Child Added! Family Count is: " + family1.countFamily());
        System.out.println(deleteChildMessage(family1.deleteChild(0)) + " Family Count is: " + family1.countFamily());
        System.out.println(deleteChildMessage(family1.deleteChild(family1Child1)) + " Family Count is: " + family1.countFamily());
        System.out.println("New Child Added! Family Count is: " + family1.countFamily());
        family1.addChild(family1Child4);
        System.out.println("New Child Added! Family Count is: " + family1.countFamily());
        family1.addChild(family1Child5);
        System.out.println("New Child Added! Family Count is: " + family1.countFamily());

        System.out.println(family1.toString());
        System.out.println(family1.getChildren().get(3).toString());

        System.out.println(deleteChildMessage(family1.deleteChild(0)) + " Family Count is: " + family1.countFamily());
        System.out.println(family1.getChildren().get(0).toString());
        System.out.println(deleteChildMessage(family1.deleteChild(6)) + " Family Count is: " + family1.countFamily());
        System.out.println(deleteChildMessage(family1.deleteChild(0)) + " Family Count is: " + family1.countFamily());
        System.out.println(deleteChildMessage(family1.deleteChild(0)) + " Family Count is: " + family1.countFamily());
        System.out.println(deleteChildMessage(family1.deleteChild(0)) + " Family Count is: " + family1.countFamily());
        System.out.println(deleteChildMessage(family1.deleteChild(0)) + " Family Count is: " + family1.countFamily());
        System.out.println(deleteChildMessage(family1.deleteChild(0)) + " Family Count is: " + family1.countFamily());

        family1.addChild(family1Child1);
        System.out.println("New Child Added! Family Count is: " + family1.countFamily());

        System.out.println(family1.toString());
        family1.addPet(myDog1);
        System.out.println("Pet Added! Welcome " + myDog1.getNickname());
        System.out.println(family1.toString());

        System.out.println("\n---------------- Family2 ------------------------");
        Human family2Mother = new Human("Ayise", "Agayeva", 1950);
        Human family2Father = new Human("Samir", "Agayev", 1945);
        Family family2 = new Family(family2Mother, family2Father);
        family2Mother.setFamily(family2);
        family2Father.setFamily(family2);
        Human family2Child1 = new Human("Amil", "Agayev", 1964);
        Human family2Child2 = new Human("Selim", "Agayev", 1970);

        family2.addChild(family2Child1);
        System.out.println("New Child Added! Family Count is: " + family2.countFamily());
        family2.addChild(family2Child2);
        System.out.println("New Child Added! Family Count is: " + family2.countFamily());
        family2.addPet(myDog2);
        System.out.println("Pet Added! Welcome " + myDog2.getNickname());
        System.out.println("Family Count is: " + family2.countFamily());
        System.out.println(family2.toString());

        System.out.println("\n---------------- Family3 ------------------------");
        Human family3Mother = new Human("Lale", "Melikova", 1950);
        Human family3Father = new Human("Zamiq", "Melikov", 1945);
        Family family3 = new Family(family3Mother, family3Father);
        family3Mother.setFamily(family3);
        family3Father.setFamily(family3);
        Human family3Child1 = new Human("Suqra", "Melikova", 1964);
        Human family3Child2 = new Human("Nergiz", "Melikova", 1970);

        family3.addChild(family3Child1);
        System.out.println("New Child Added! Family Count is: " + family3.countFamily());
        family3.addChild(family3Child2);
        System.out.println("New Child Added! Family Count is: " + family3.countFamily());
        family3.addPet(myCat1);
        System.out.println("Pet Added! Welcome " + myCat1.getNickname());
        System.out.println("Family Count is: " + family3.countFamily());
        System.out.println(deleteChildMessage(family3.deleteChild(1)) + " Family Count is: " + family3.countFamily());
        System.out.println("Family Count is: " + family3.countFamily());
        System.out.println(family3.toString());

        myCat1.eat();
        myCat1.respond();
        myCat1.foul();

        family3Mother.greetPet(myCat1);
        family3Mother.describePet(myCat1);
        boolean isFeed = family3Mother.feedPet(myCat1);
        System.out.println("Did the family feed their pet? --> " + isFeed);

        System.out.println("\n---------------- Family4 ------------------------");
        Family family4 = new Family(family3Mother, family3Father);
        family4.addChild(family3Child1);
        System.out.println("New Child Added! Family Count is: " + family4.countFamily());
        family4.addPet(myCat1);
        System.out.println("Pet Added! Welcome " + myCat1.getNickname());

        System.out.println("hashCode(family1, family2): " + (family1.hashCode() == family2.hashCode()));
        System.out.println("equals(family1, family2): " + family1.equals(family2));
        System.out.println("hashCode(family3, family4): " + (family3.hashCode() == family4.hashCode()));
        System.out.println("equals(family3, family4): " + family3.equals(family4));
        family1.addPet(myDog3);

        System.out.println("\n------------- Advanced Part ---------------------");
        Human randomSexChild = family2Father.bornChild(family1Father.getFamily());
        System.out.println("randomSexChild: " + randomSexChild.toString());
        System.out.println(family1Father.getFamily().toString());
    }

    public static String deleteChildMessage(boolean isDeleteChild) {
        return isDeleteChild ? "Child was found and deleted!" : "This child does not belong to this family!";
    }
}
