package BinarySearch;

public class FirstLastIndex {

    public static void main(String[] args) {

        int arr[] ={1,2,3,4,5,5,5,5,5,5,5,5,5,5,6,7,8,9};
        int target = 11;


       int[] ans = searchtarget(arr,target);
        System.out.println("["+ans[0]+","+ans[1]+"]");
        System.out.printf("[%d ,%d ] ", ans[0], ans[1]);
    }


    static int[] searchtarget(int[]nums, int target){

    int[] ans ={-1,-1};
    int start = searchIndexes(nums,target,true);
    int end = searchIndexes(nums,target,false);
     ans[0] = start;
     ans[1]= end;

     return ans;

    }

   static int searchIndexes(int arr[],int target,boolean findFirstIndex)
    {
        int ans =-1;
        int start =0;
        int end = arr.length-1;

        while(start <= end){

            int mid = start + (end- start)/2;

            if(target > arr[mid])
            {
                start= mid+1;
            }else if(target < arr[mid]){
                end = mid-1;
            }else{
                ans = mid;
                if(findFirstIndex){
                    end = mid-1;
                }else{
                    start=mid+1;
                }
            }

        }
            return ans;
    }

}
