package conditionals_Loops;

import java.util.Scanner;

public class CaseChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter string : ");

        String str = input.next();

        if (str.length() > 2) {

            char ch = str.charAt(2);
            System.out.println("Character at index 2: " + ch);

            if (ch >= 'a' && ch <= 'z') {
                System.out.println("Lower Case");
            } else if (ch >= 'A' && ch <= 'Z') {
                System.out.println("Upper Case");
            } else {
                System.out.println("Not an alphabet");
            }

        } else {
            System.out.println("String too short!");
        }

        input.close();
    }
}
