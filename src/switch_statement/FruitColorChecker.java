package switch_statement;

import java.util.Scanner;

public class FruitColorChecker {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print(" Enter the fruit name : ");
        String fruit = inp.next().toLowerCase();

        switch(fruit)
        {
            case "apple":
                System.out.println("Red");
                break;
            case "orange":
                System.out.println("orange");
                break;
            case "grape":
                System.out.println("Green");
                break;
            case  "mango" :
                System.out.println("Yellow");
                break;
            default:
                System.out.println(" Invalid fruits ");
                break;
        }

        System.out.println(" End of program ");
        inp.close();

    }
}
