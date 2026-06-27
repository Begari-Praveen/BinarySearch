import java.util.*;

class Main {

    public static int findPivot(int[] arr) {

        int low = 0;
        
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Case 1: Is mid the pivot?
             if(mid < high && arr[mid] > arr[mid+1]){
                 return mid;
             }
            // Case 2: Is mid - 1 the pivot?
            if(mid > low && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            // Case 3: Handle duplicates
            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
         
               if(low < high && arr[low] > arr[low+1]){
                   return low;
               }
               low++;
               if(high > low && arr[high] < arr[high-1]){
                   return high-1;
               }
               high--;
            }
            else if(arr[low] > arr[mid]){
                 high = mid-1;
            }
            else{
                 low = mid+1;
             }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 2, 3, 4, 2};

        int pivot = findPivot(arr);

        if (pivot == -1) {
            System.out.println("Array is not rotated");
        } else {
            System.out.println("Pivot Index : " + pivot);
            System.out.println("Pivot Element : " + arr[pivot]);
        }
    }
}
