package DSAKrnaHai;
import java.util.Scanner;
public class TwoSum {

    public static int[] returnIndex(int arr[] ,int target){

        for( int i=0;i < arr.length;i++){
            for(int j=i+1;j<arr.length;j++)
            {
                if(target == arr[i] + arr[j]){
                   return new int[]{i,j};
                }
            }
        }
     return new int[]{-1,-1};
    }

    public static void main(String[]args){

        int arr[] = {1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target value : ");
        int target = sc.nextInt();
        int result[] = returnIndex(arr,target);
        System.out.println("index : " + result[0] + " " + result[1]);
        System.out.println("value : " + arr[result[0]] + " " + arr[result[1]]);
    }
}
