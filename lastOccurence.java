import java.util.*;

class Main {

    public static int lastOccurrence(int[] arr, int target) {

         int low =0;
         int high = arr.length-1;
         while(low <= high){
             int mid = low + (high - low)/2;
             if(arr[mid] <= target){
                 low = mid+1;
             }
             else{
                 high = mid-1;
             }
         }
         if(arr[high] != target && high < 0){
             return -1;
         }
      return high;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,4,4,4,4,7};

        int target = 4;

        System.out.println(lastOccurrence(arr, target));
    }
}
