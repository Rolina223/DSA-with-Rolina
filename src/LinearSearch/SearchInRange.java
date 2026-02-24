package LinearSearch;

public class SearchInRange {

    public static void main(String[] args) {

        int arr[] = {1,4,11,-21,73,90,5,6,88,97,-74,12,25,56};
        int target = -21;
        int startIndex = 2;
        int lastIndex = 6;
        boolean ans = search(arr,startIndex,lastIndex,target);
        System.out.println("Element found : " + ans);

    }

    static boolean search(int arr[] , int start, int end,int elem)
    {
        if(arr.length== 0)
        {
            return false;
        }

        if (start < 0 || end >= arr.length || start > end) {
            return false;
        }

        for (int i = start; i <end; i++) {
            if(arr[i]==elem)
            {
                return true;

            }
        }
        return false;
    }

}
