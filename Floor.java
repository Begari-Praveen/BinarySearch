import java.util.*;

class Main {

    public static int floor(int[] arr, int target) {
         int low =0;
         int high = arr.length-1;
         while(low <= high){
             int mid = low + (high-low)/2;
             if(arr[mid] == target){
                 return mid;
             }
             else if(arr[mid] > target){
                 high = mid-1;
             }
             else{
                 low = mid+1;
             }
         }
         if(high <0){
             return -1;
         }
         return high;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 6};

        int target = 2;

        int ans = floor(arr, target);

        System.out.println(ans);
    }
}
