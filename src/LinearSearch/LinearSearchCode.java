package LinearSearch;

public class LinearSearchCode {

    public static void main(String[] args) {

        int[] arr= {1,3,4,2,77,66,45,90,245,76,456,781,0};
        System.out.println("Element found at position: " + search(arr,243));

    }

    static int search(int arr[], int elem)
    {
        if(arr == null || arr.length ==0)
        {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==elem)
            {
                return i;
            }
        }
        return -1;

    }
}
