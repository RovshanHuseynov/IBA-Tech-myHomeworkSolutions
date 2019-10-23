package hw.hw2;

import java.util.Random;
import java.util.Scanner;

public class ShootingAtTheSquare {
    static char [][] printedArray = new char[6][6];;
    public static void main(String[] args) {
        fillSquare();
        System.out.println("All set. Get ready to rumble!");
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        boolean isInt;
        int targetLine = random.nextInt(4) + 1;  // [1,5]
        int targetBar = random.nextInt(4) + 1;  // [1,5]
        int guessedLine, guessedBar;
        String test;

        while(true){   // infinite loop
            System.out.print("Please enter a line for fire: ");
            test = in.nextLine();
            if(isInt(test) == false){    // check line for fire
                System.out.println("Wrong input");
                continue;
            }
            else{
                guessedLine = Integer.parseInt(test);
            }

            System.out.print("Please enter a shooting bar: ");
            test = in.nextLine();
            if(isInt(test) == false){      // check shooting bar
                System.out.println("Wrong input");
                continue;
            }
            else{
                guessedBar = Integer.parseInt(test);
            }

            if(targetLine == guessedLine && targetBar == guessedBar ){   // end of the infinite loop
                System.out.println("You have won!");
                printedArray[guessedLine][guessedBar] = 'x';
                printSquare();
                break;
            }

            printedArray[guessedLine][guessedBar] = '*';
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
                System.out.print(printedArray[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void fillSquare(){    // fill the square with '-'
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                printedArray[i][j] = '-';
            }
        }
    }

    public static boolean isInt(String s){    // is the input string contains only numbers and is the number between 1 and 5 ?
        boolean flag = true;

        for(int i=0; i<s.length(); i++){      // is the input string contains only numbers
            if(s.charAt(i) < '0' || s.charAt(i) > '9'){
                flag = false;
                break;
            }
        }

        if(flag == true){     // is the number between 1 and 5 ?
            if(Integer.parseInt(s) < 1 || Integer.parseInt(s) > 5 ){
                flag = false;
            }
        }

        return flag;
    }
}
