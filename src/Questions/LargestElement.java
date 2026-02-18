package Questions;

public class LargestElement {

    public static void main(String[] args) {

        int[] arr = {1 ,3 ,5,13,99,121,14,87};
        int ans = largest(arr);
        System.out.println("Largest element in arryay is : " + ans);
    }

    static int largest(int arr[] ){

        int max = arr[0];
        if(arr.length == 0 || arr == null)
        {
            return -1;
        }
        //Loop startef from 1 because 0th already checked
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }
}
