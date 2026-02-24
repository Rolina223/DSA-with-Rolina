package LinearSearch;

public class FindMinimumElement {
    public static void main(String[] args) {

        int arr[] ={1,3,-21,12,-21,-21,-21,-21,23,24,19,-21,90,-109,66};
        System.out.println(searchMin(arr));

    }

    static int searchMin(int arr[])
    {
        if(arr.length==0)
        {
            return -1;
        }
        
        int min = arr[0];

        for (int j = 0; j < arr.length; j++) {
            if(arr[j]<min)
            {
                min =arr[j];
            }
        }
        return min;
    }

}
