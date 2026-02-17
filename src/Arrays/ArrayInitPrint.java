package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInitPrint {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int[] marks = new int[5];
        marks[0] =1;
        marks[1] =2;
        marks[2] =3;
        marks[3]=4;
        marks[4] =5;

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

        System.out.print(" Second Method : ");
        int[]salary = {12,13,14,14,15};

        for(int num :salary)
        {
            System.out.println(num);
        }

        System.out.println("Third method : ");

        String[]name = new String[5];
        for (int i = 0; i < name.length; i++) {
            System.out.print("Enter the name : ");
            name[i] = inp.next();
        }

        for (String nam :name ){
            System.out.println(nam);
        }

        System.out.println("Fourth method : ");

        int[]four = {1,3,4,5,6,7,8,9};
        System.out.print(Arrays.toString(four));
        inp.close();
    }
}
