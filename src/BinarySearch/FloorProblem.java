package BinarySearch;

public class FloorProblem {

    public static void main(String[] args) {

        int arr[] ={1,2,4,5,6,7,10,12,15,18,19,21};
        int target =9;
        System.out.println(findFloor(arr,target));
    }


    static int findFloor(int arr[],int target)
    {

        if(arr==null || arr.length ==0){
            return -1;
        }
        int start =0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid]==target)
            {
                return arr[mid];
            } else if (arr[mid] <target) {
                start = mid + 1;

            }else{
                end = mid - 1;
            }

        }
        return arr[end];
    }

}
