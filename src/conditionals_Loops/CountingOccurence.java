package conditionals_Loops;

import java.util.Scanner;

public class CountingOccurence {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println(" Enter the value : ");
        int val = inp.nextInt();
        System.out.println(" Enter the value of finding the count : ");
        int countVal = inp.nextInt();
        int rem;
        int denom;
        int count = 0;
        int temp = val;

        while(temp > 0)    //trm p= 12312
        {
            rem = temp % 10;

            if(rem == countVal)
            {
                count++;
            }
            temp = temp /10;
        }
        System.out.println(" The digit count occour is " + count);

        inp.close();
    }
}
