package BinarySearch;

public class OrderAgnoistic {

    public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,7,8,9};
    int target = 5;
        System.out.println("Element found at index : " + searchAgnoistic(arr,target));
    }

    static int searchAgnoistic(int arr[], int target)
    {
        if(arr==null || arr.length==0){
            return -1;
        }
        int start =0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end]; //check for Ascending

        while(start<=end)
        {

            int mid = start +  (end- start)/2;

            if(target == arr[mid]){
                return mid;
            }
            //If Array is Ascending order
            if(isAsc){
                if(target> arr[mid]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            //Descending order
            else{
                if(target > arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }

}
