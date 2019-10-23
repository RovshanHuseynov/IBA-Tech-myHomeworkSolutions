package hw.hw1;

import java.util.Random;
import java.util.Scanner;

public class Numbers {
    static int[] storedIntegers = new int[100];
    static int counterofGuesses = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int target;
        String name;

        System.out.print("Enter the name: ");
        name = in.nextLine();

        System.out.println("Let the game begin!");
        target = random.nextInt(100);

        while (true) {   // infinite loop
            System.out.print("Enter your guess number: ");
            String strIn = in.nextLine();
            if(isInt(strIn) == true) {
                int guessedInt = Integer.parseInt(strIn);
                storeGuesses(guessedInt);

                if (guessedInt == target) {    // end of the infinite loop
                    System.out.printf("Congratulations, %s!\n", name);
                    break;
                } else if (guessedInt < target) {
                    System.out.println("Your number is too small. Please, try again.");
                } else {
                    System.out.println("Your number is too big. Please, try again.");
                }
            }
            else{
                System.out.println("Wrong input. Enter the number again: ");
            }
        }
    }

    public static void storeGuesses(int x) {    // add the number to the array and sort the array descendingly
        storedIntegers[counterofGuesses] = x;
        counterofGuesses++;
        System.out.print("Your numbers: ");

        for (int i = 0; i < counterofGuesses - 1; i++){
            for (int j = 0; j < counterofGuesses - 1; j++){
                if(storedIntegers[j] < storedIntegers[j+1]){
                    int temp = storedIntegers[j];
                    storedIntegers[j] = storedIntegers[j+1];
                    storedIntegers[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < counterofGuesses; i++) {
            System.out.print(storedIntegers[i] + " ");
        }
        System.out.println();
    }

    public static boolean isInt(String s){   // is the input string contains only numbers?
        boolean flag = true;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) < '0' || s.charAt(i) > '9'){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
