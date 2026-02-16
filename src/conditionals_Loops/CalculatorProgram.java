package conditionals_Loops;

import java.util.Scanner;

public class CalculatorProgram {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int res = 0;

        while (true) {

            System.out.print(" Enter the operators '+ ,-,*,/,%'  : ");

            char op = inp.next().trim().charAt(0);


            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                //Input two number
                System.out.print("Enter the number1 : ");
                int num1 = inp.nextInt();
                System.out.print("Enter the number2 : ");
                int num2 = inp.nextInt();


                if (op == '+') {
                    res = num1 + num2;
                }
                if (op == '-') {
                    res = num1 - num2;
                }
                if (op == '*') {
                    res = num1 * num2;
                }
                if (op == '%') {
                    if (num2 != 0) {
                        res = num1 % num2;
                    } else {
                        System.out.println("cannot divide by 0");
                    }

                }
                if (op == '/') {
                    if (num2 != 0) {
                        res = num1 / num2;
                    } else {
                        System.out.println(" Cannot divide by zero");
                    }

                }

            }
            //For terminating the Operations
            else if (op == 'y' || op == 'Y') {
                break;
            } else {
                System.out.println("Invalid operators");
                 res =0;
            }

            //  inp.close();
        }


    }
}
