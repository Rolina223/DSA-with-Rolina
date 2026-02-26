package BinarySearch;

public class BinarySearchIndexDescending {

    public static void main(String[] args) {

        int arr[] ={99,88,77,66,55,44,33,22,11,0,-11,-21,-51};
        int target = -51;
        System.out.println("Element found at index position : " + searchIndex(arr,target));


    }

    static int searchIndex(int arr[], int target)
    {
        if(arr==null || arr.length ==0){
            return -1;
        }

        int start =0;
        int end = arr.length-1;

        while(start <= end)
        {
            int mid = start + (end -start)/2;

            if(target> arr[mid])
            {
                end = mid-1;
            } else if (target <arr[mid]) {
                start = mid+1;

            }
            else{
                return mid;
            }
        }
        return -1;
    }


}
