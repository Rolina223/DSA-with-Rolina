package conditionals_Loops;

import java.util.Scanner;

public class BiggestOfThree {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println(" Enter the value of n1 , n2 , n3 ");
        int n1 = inp.nextInt();
        int n2 = inp.nextInt();
        int n3 = inp.nextInt();

        int max = n1;

        if(n2>max)
        {
            max = n2;
        } if(n3>max) {
            max= n3;
        }
        System.out.println(max);

        inp.close();

    }
}
