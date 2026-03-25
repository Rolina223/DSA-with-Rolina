package BinarySearch;

public class SortedRotated {

    public static void main(String[] args) {

        int arr[] = {4,5,6, 7, 8, 9, 10, 0, 1, 2, 3};
        int target =1;
        int res = finfPivot(arr);
        System.out.println("Pivot element position : " + res);
        int ans1 =SaerchFromPivot(arr,0,res,target);
        if(ans1!=-1){
            System.out.println("Target element found at pos: " + ans1);
        }else{
            int ans2 = SaerchFromPivot(arr,res+1, arr.length-1,target );
            System.out.println("Target element found at pos : " + ans2);
        }


    }

    //Find target

    static int SaerchFromPivot(int nums[],int start,int end,int target){

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] > target){
                end = mid-1;
            } else if (nums[mid] < target) {
                start = mid+1;

            }else{
                return mid;
            }
        }
        return -1;
    }

    //3 4 5 6 7 0 1 2
    static int finfPivot(int arr[]) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end-start)/2;

            //Finding the cases for Mid
            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }

            if(start < mid && arr[mid-1]>arr[mid]){
                return mid-1;
            }

            if(arr[start] <= arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }

        }
        return-1;
    }
}