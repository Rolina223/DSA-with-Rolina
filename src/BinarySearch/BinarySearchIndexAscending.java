package BinarySearch;

public class BinarySearchIndexAscending {

    public static void main(String[] args) {

        int arr[] = {-12,-11,-10,0,2,5,7,8,9,123,615,991,999,1091,8888};
        int target = 991;
        System.out.println(searchIndex(arr,target));

    }

    static int searchIndex(int arr[], int target)
    {
        int start =0;
        int end = arr.length-1;


        while(start <= end){

            //Find the mid
            // Because Addition of start and end may exceed the integer range value
            int mid = start + (end- start)/2;

            if(target > arr[mid]){
                start = mid+1;
            } else if (target < arr[mid]) {
                end = mid -1;
            }else {
                return mid;
            }

        }
        return -1;
    }

}
