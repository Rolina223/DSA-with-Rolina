package BinarySearch;

public class FindInMountainArray {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 11, 5, 3, 1};
        int target = 3;
       // System.out.println("The position fo element is " );
        int res = findPeak(arr);
        System.out.println("The position of peak element is " + res);

        int ans1 = searchAgnoistic(arr,0,res,target);
        if(ans1 != -1){
            System.out.println(ans1);
        }else {
            int ans2 = searchAgnoistic(arr,res+1, arr.length-1,target );
            System.out.println(ans2);
        }


    }

    //Order Agnoistic
    //Search the target from start to Peak
    //Search the target Peak+ to End

    static int searchAgnoistic(int arr[],int start,int end,int target){

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end- start)/2;

            if(target == arr[mid]){
                return  mid;
            }

            if(isAsc){
                if(arr[mid] < target){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }else {
                if(arr[mid]>target){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }
        }
        return -1;

    }



    //Find the peak element
    static int findPeak(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;

    }
}
