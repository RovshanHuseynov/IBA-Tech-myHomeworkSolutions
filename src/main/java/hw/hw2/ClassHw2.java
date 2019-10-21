package hw.hw2;

import java.util.Random;
import java.util.Scanner;

public class ClassHw2 {
    static char [][] a = new char[6][6];;
    public static void main(String[] args) {
        fillSquare();
        System.out.println("All set. Get ready to rumble!");
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        boolean isInt;
        int targeti = random.nextInt(4) + 1;  // [1,5]
        int targetj = random.nextInt(4) + 1;  // [1,5]
        int guessedLine, guessedBar;
        String test;

        while(true){   // infinite loop
            System.out.print("Please enter a line for fire: ");
            test = in.nextLine();
            if(isInt(test) == false){
                System.out.println("Wrong input");
                continue;
            }
            else{
                guessedLine = Integer.parseInt(test);
            }

            System.out.print("Please enter a shooting bar: ");
            test = in.nextLine();
            if(isInt(test) == false){
                System.out.println("Wrong input");
                continue;
            }
            else{
                guessedBar = Integer.parseInt(test);
            }

            if(targeti == guessedLine && targetj == guessedBar ){
                System.out.println("You have won!");
                a[guessedLine][guessedBar] = 'x';
                printSquare();
                break;
            }

            a[guessedLine][guessedBar] = '*';
            printSquare();
        }
    }

    public static void printSquare(){    // print the square in the console
        for(int i=0; i<=5; i++){
            System.out.print(i + " | ");
        }
        System.out.println();
        for(int i=1; i<=5; i++){
            System.out.print(i + " | ");
            for(int j=1; j<=5; j++){
                System.out.print(a[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void fillSquare(){    // fill the square with '-'
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                a[i][j] = '-';
            }
        }
    }

    public static boolean isInt(String s){    // is the input string contains only numbers and is the number between 1 and 5 ?
        boolean flag = true;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) < '0' || s.charAt(i) > '9'){
                flag = false;
                break;
            }
        }

        if(flag == true){
            if(Integer.parseInt(s) < 1 || Integer.parseInt(s) > 5 ){
                flag = false;
            }
        }

        return flag;
    }
}
