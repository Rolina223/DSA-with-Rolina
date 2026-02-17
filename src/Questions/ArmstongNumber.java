package Questions;

import java.util.Scanner;

public class ArmstongNumber {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int num = inp.nextInt();

        boolean ans = isArmstrong(num);
        System.out.println(num + " is armostong number ? " + ans );

    }

    static boolean isArmstrong(int num) {

        int sum = 0;
        int temp = num;
        if (num < 0) {
            return false;
        }

        while (temp > 0) {
            int rem = temp % 10;
            int cube = rem * rem * rem;

            sum = sum + cube;
             temp = temp / 10;

        }

        if(sum == num)
        {
            return true;
        }
       return false;

    }
    }

