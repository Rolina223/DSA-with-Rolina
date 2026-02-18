package Questions;

public class LargestElemInRange {

    public static void main(String[] args) {

        int arr[] = {1 ,3 ,5,13,99,121,14,87,11};

        System.out.println( MaxElemRange(arr,1,4));
    }

    static int MaxElemRange(int arr[], int start , int end)
    {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        if (start < 0 || end >= arr.length || start > end) {
            return -1;
        }
        int max = arr[start];

        for ( int i = start; i <= end; i++) {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }
}
