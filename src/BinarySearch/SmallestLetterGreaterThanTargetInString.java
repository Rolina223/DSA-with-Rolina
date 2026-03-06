package BinarySearch;

public class SmallestLetterGreaterThanTargetInString {

    public static void main(String[] args) {

        char[] str = {'a' ,'b','f' ,'j'};
        char result = SearchCeilInString(str,'b');
        System.out.println(result);

    }

    static char SearchCeilInString(char letters[], char target)
    {
        int start = 0;
        int last = letters.length-1;

        while(start <= last)
        {
            int mid = start + (last - start)/2;

         if(letters[mid] > target ){
             last = mid-1;
         }else{
             start = mid+1;
         }

        }
            return letters[start % letters.length];
    }

}
