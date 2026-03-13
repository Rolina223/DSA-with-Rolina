package BinarySearch;

public class FinfPeakElemMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,11,5,3,1};
        int res = searchElem(arr);
        System.out.println("The position fo element is " + res);

    }

    // 1 5 6 7 9 11 8 7 3 2 1 

    static int searchElem(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
        int mid = start +(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end =mid;
            }
            else{
                start = mid+1;
            }
        }
        return end;
    }
}
