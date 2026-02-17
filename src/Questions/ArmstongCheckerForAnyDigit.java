package Questions;

import java.util.Scanner;

public class ArmstongCheckerForAnyDigit {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        boolean ans = isArmstrong(num);
        System.out.println(ans);
    }

    static boolean isArmstrong(int num)
    {
        if(num < 0) return false;

        if(num ==0) return true;

        //FInd the length of number
        double count =0;
        int temp = num;
        int temp1 = num;
        double sum =0;

        while(temp>0)
        {
            temp = temp/10;
            count++;
        }
        //System.out.println(count);

        //To check the arstrong

        while(temp1 >0)
        {
            double rem = temp1%10;
            sum = sum + Math.pow(rem,count);
            temp1 = temp1/10;
        }

        return sum == num;
    }

}
