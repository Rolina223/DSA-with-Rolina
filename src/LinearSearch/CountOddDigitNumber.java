package LinearSearch;

public class CountOddDigitNumber {

    public static void main(String[] args) {

        int arr [] ={0,1,2,32,-1321,111223,12,34,43,224};
        System.out.println("Odd number count digit " + searchOdd(arr));
    }

    static int searchOdd(int arr[])
    {
        int count =0;

        for (int i = 0; i < arr.length; i++) {

            int tempCount =0;
            int temp = Math.abs(arr[i]);

            if(temp ==0)
            {
                tempCount =1;
            }
            else {
                while (temp > 0) {
                    temp /= 10;
                    tempCount++;
                }
            }
            if(tempCount % 2 ==1)
            {
                count++;
            }
        }
        return  count;
    }
}
