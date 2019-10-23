package hw.hw3;

import java.util.Scanner;

public class WeekPlanner {
    static String [][] schedule = new String [7][2];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "";
        fillScheduleArray();

        while(true) {       // infinite loop
            System.out.print("Please, input the day of the week: ");
            input = in.nextLine();
            if(input.equals("exit")){
                break;     // end the infinite loop
            }

            while(true){    // the program goes to the next iteration until the user enters a valid weekday
                if(input.equals("exit") || checkValidWeekday(input)){
                    break;   // valid weekday found
                }
                System.out.println("Sorry, I don't understand you, please try again.");
                input = in.nextLine();
            }

            if(input.equals("exit")){
                break;     // end the infinite loop
            }

            getTask(input);
        }
    }

    public static void fillScheduleArray(){   // fill the schedule array
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "go to hometown";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "meet up with friends";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "go shopping";
        schedule[5][0] = "Friday";
        schedule[5][1] = "do a course";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "have a rest";
    }

    public static boolean checkValidWeekday(String s) {    // check the input is whether a valid weekday
        s = s.trim();        // take into account that the user may have accidentally
                             // entered a space after the day of the week.

        for(int i=0; i<7; i++) {
            if (s.toLowerCase().equals(schedule[i][0].toLowerCase())){
                return true;
            }
        }
        return false;
    }

    public static void getTask(String s){     // returns task of the valid weekday
        s = s.trim();      // take into account that the user may have accidentally
                           // entered a space after the day of the week.

        for(int i=0; i<7; i++) {
            if (s.toLowerCase().equals(schedule[i][0].toLowerCase())){
                System.out.println("Your tasks for " + schedule[i][0] + ": " + schedule[i][1]);
                return;
            }
        }

        System.out.println("Sorry, I don't understand you, please try again.");
        return;
    }
}
