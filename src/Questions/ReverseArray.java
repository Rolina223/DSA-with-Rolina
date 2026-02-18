package Questions;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {


        int arr[]= {1,2,3,4,5,6,7,8,9};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int arr[])
    {


         int start = 0;
         int last = arr.length-1;
         while(start < last)
         {
            swap(arr,start,last);
            start++;
            last--;
         }
    }

    static void swap(int arr[], int start, int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}
