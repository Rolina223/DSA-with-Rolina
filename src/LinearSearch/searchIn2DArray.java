package LinearSearch;

public class searchIn2DArray {
    public static void main(String[] args) {

        int [][] arr = {

                {1,2,3},
                {55,12,56,68},
                {142,92,88,45,63},
                {10,52}
        };

        int target = 521;

      int res[] = search(arr,target);

      if(res[0]==-1)
      {
          System.out.println("Not found");
      }

        System.out.print(" Row : " + res[0] + " Coloum : " + res[1]);


    }

    static int[] search(int[][] arr, int goal)
    {
        if(arr.length==0 || arr == null)
        {
            return new int[]{-1,-1};
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==goal)
                {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
