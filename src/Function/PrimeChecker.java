package Function;

import java.util.Scanner;

public class PrimeChecker {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = inp.nextInt();
        boolean ans = isPrime(num);
        System.out.println(num + " Is prime number ? : " + ans);
        inp.close();
    }

    static boolean isPrime(int n)
    {
        if(n <=1)
        {
            return false;
        }

        for(int i =2 ;i*i<=n;i++)
        {
            if(n % i ==0)
            {
                return false;
            }
        }
        return true;
    }

}
