package DSAKrnaHai;

import java.util.Scanner;


public class RunningSum {
    public static int[] runningSum(int arr[]){

        int res[] = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
                res[i] = sum;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
                 arr[i] = sc.nextInt();
        }
        System.out.println("Print array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int result[]  = runningSum(arr);
        System.out.print("Result Print array : ");
        for ( int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}
