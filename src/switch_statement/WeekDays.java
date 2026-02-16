package switch_statement;

import java.util.Scanner;

public class WeekDays {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println(" Enter the week number : ");
        int dayNumber = inp.nextInt();
        
        String dayName = switch (dayNumber){

            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            case 8 -> "Myday";
            default -> "Invalid Input";
        };

        System.out.println(dayName);

        inp.close();

    }
}
