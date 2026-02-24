package LinearSearch;

public class indexReturnSearching {

        public static void main(String[] args) {

            int[] arr = {1, 4, 11, -21, 73, 90, 5, 6, 88, 97, -74, 12, 25, 56};
            int target = -21;
            int startIndex = 2;
            int endIndex = 6;

            int ans = search(arr, startIndex, endIndex, target);

            if (ans != -1) {
                System.out.println("Element found at index: " + ans);
            } else {
                System.out.println("Element not found");
            }
        }

        static int search(int[] arr, int start, int end, int elem) {

            if (arr.length == 0) {
                return -1;
            }

            if (start < 0 || end >= arr.length || start > end) {
                return -1;
            }

            for (int i = start; i <= end; i++) {
                if (arr[i] == elem) {
                    return i;   // return index
                }
            }

            return -1;  // not found
        }
    }


