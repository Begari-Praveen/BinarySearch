import java.util.*;

class Main {

    public static int searchInfiniteArray(int[] arr, int target) {

        int low = 0;
        int high =1;
        while(arr[high] < target){
            low = high;
            high = high *2;
        }
        while(low<=high){
            int mid = low +(high - low)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
      return -1; 
    }

    public static void main(String[] args) {

        int[] arr = {
            1,2,3,4,5,6,7,8,9,10,
            11,12,13,14,15,16,17,18,19,20,
            21,22,23,24,25,26,27,28,29,30
        };

        int target = 25;

        System.out.println(searchInfiniteArray(arr, target));
    }
}
