package LinearSearch;

public class RichestCustomerMatrixColSUm {

    public static void main(String[] args) {

        int arr[][] = {
                {1, 2, 3},
                {23, 23, 11},
                {1, 19, 11, 1, 11},
                {2, 3, 45, 6, 7}
        };
        int[] res = maxRowReturn(arr);
        for (int num : res) {
            System.out.print(num + " ");
        }

        int result = maxRowReturnTwo(arr);
        System.out.println("Row number is " + (result+1));

    }


    static int maxRowReturnTwo(int arr[][])
    {

        int maxRow = -1;
        int maxSum = Integer.MIN_VALUE;
        System.out.println("length " + arr.length);
        for (int row = 0; row < arr.length; row++) {
            int sum =0;
            for (int col = 0; col <arr[row].length; col++) {
                sum += arr[row][col];

            }
            // System.out.println(" " + sum);
            if(sum > maxSum)
            {
                maxSum = sum;
                maxRow = row;
            }

        }
        return maxRow;
    }



    static int[] maxRowReturn(int arr[][])
    {

        int[] maxRow = null;
        int maxSum = Integer.MIN_VALUE;
        System.out.println("length " + arr.length);
        for (int row = 0; row < arr.length; row++) {
            int sum =0;
            for (int col = 0; col <arr[row].length; col++) {
                sum += arr[row][col];

            }
           // System.out.println(" " + sum);
            if(sum > maxSum)
            {
                maxSum = sum;
                maxRow = arr[row];
            }

        }
        return maxRow;
    }

}
