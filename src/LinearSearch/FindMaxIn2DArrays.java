package LinearSearch;

public class FindMaxIn2DArrays {

    public static void main(String[] args) {

        int [][] arr = {
                {1,2,3},
                {55,12,56,68},
                {142,92,88,45,63},
                {10,52}
        };

        System.out.println(search(arr));

    }

    static  int search2(int ar[][])
    {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < ar.length; row++) {
            for (int col = 0; col < ar[row].length; col++) {
                if(ar[row][col]>max)
                {
                    max = ar[row][col];
                }
            }
        }

        return max;
    }


    static  int search(int ar[][])
    {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < ar.length; row++) {
            for (int col = 0; col < ar[row].length; col++) {
                if(ar[row][col]>max)
                {
                    max = ar[row][col];
                }
            }
        }

        return max;
    }

}
