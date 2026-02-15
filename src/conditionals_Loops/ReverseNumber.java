package conditionals_Loops;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number : ");
        int num = sc.nextInt();
        int reverse =0;


        int temp = Math.abs(num);
        while(temp>0)
        {
            int rem = temp %10;
            reverse =  reverse *10 + rem;
            temp = temp/10;
        }

        if (num < 0) {
            reverse = -reverse;
        }

        System.out.println(" The reverse of " + num + " Is : " + reverse);
        //"If we reverse an integer, leading zeros are automatically removed because integers do not store formatting."
        //For input : 12310 -> 1321
    }
}
