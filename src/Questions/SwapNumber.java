package Questions;

import java.util.Arrays;
import java.util.Scanner;

public class SwapNumber {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int  size = inp.nextInt();
        int [] arr = new int[size];
        //Enter the element in array
        System.out.print("Enter the element in array : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        swap(arr, 1 ,3);
        System.out.println("After swap ");
        System.out.println(Arrays.toString(arr));
        inp.close();

    }

    static void swap(int arr[],int index1 , int index2)
    {
        if(index1 >= arr.length || index2 >= arr.length)
        {
            System.out.println("Invalid input!! ");
        }

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
