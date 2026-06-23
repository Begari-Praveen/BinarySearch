import java.util.*;

class Main {

    public static int firstOccurrence(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(arr[mid] >= target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        if(low == arr.length || arr[low] != target) {
            return -1;
        }

        return low;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,4,4,4,4,7};

        int target = 4;

        System.out.println(firstOccurrence(arr, target));
    }
}
