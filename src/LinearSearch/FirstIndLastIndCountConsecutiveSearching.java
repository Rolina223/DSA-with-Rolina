package LinearSearch;

public class FirstIndLastIndCountConsecutiveSearching {

    public static void main(String[] args) {

        int arr[] ={1,3,-21,12,-21,-21,-21,-21,23,24,19,-21,90,109,66};

        int [] result = search(arr,-211);

        if(result[0]==-1){
            System.out.println("Emeent not found");
        }

        System.out.println(" First index " + result[0]);
        System.out.println(" last index " + result[1]);
        System.out.println(" Count " + result[2]);


    }

    static int[] search(int arr[], int target)
    {

        int firstIndex =-1;
        int lastIndex =-1;
        int count =0;
        boolean consecutive = false;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==target)
            {
                if(firstIndex ==-1)
                {
                    firstIndex =i;
                }

                lastIndex =i;
                count++;
                if( i < arr.length-1 && arr[i]==target && arr[i+1] == target)
                {
                    consecutive = true;
                }

            }

        }

        if (consecutive)
        {
            System.out.println(" consecutive element");
        }
        else {
            System.out.println("Not consecutive");
        }
                    return new int[]{firstIndex,lastIndex,count};

    }

}
