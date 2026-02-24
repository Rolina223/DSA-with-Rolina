package LinearSearch;

public class FirstIndLastIndCountSearching {

    public static void main(String[] args) {

        int arr[] ={1,3,-21,12,-21,23,24,19,-21,90,109,66};
        int target =-211;

        int[] result = search(arr,target);

        if(result[0]==-1){
            System.out.println("Element not found");
        }
        System.out.println(" First index " + result[0]);
        System.out.println(" last index " + result[1]);
        System.out.println(" Count " + result[2]);


    }

    static int[] search(int arr[],int target) {
        int startIndex = -1;
        int lastIndex = -1;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {

                if (startIndex == -1) {
                    startIndex = i;
                }

                lastIndex = i;
                count++;

            }

        }


        return new int[]{startIndex, lastIndex, count};

    }
}
