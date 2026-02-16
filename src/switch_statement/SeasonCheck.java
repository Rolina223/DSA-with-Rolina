package switch_statement;

import java.util.Scanner;

public class SeasonCheck {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print(" Enter month number : ");
        int monthNumber = inp.nextInt();

        String season = switch (monthNumber){

            case 12,1,2 -> "winter";
            case 3,4,5 -> "Spring";
            case 6,7,8 -> "Summer";
            case 9,10,11-> "Autumn";
            default -> "Invliad month Number ";
        };

        System.out.println(season);
        System.out.println(" End of Program ");
        inp.close();

    }
}
