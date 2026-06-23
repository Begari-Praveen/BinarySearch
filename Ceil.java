calss Main{
public static int searchInsert(int[] arr, int target) {
     int low = 0;
     int high = arr.length - 1;

     while(low <= high){
         int mid = low + (high - low) / 2;

         if(arr[mid] == target){
             return mid;
         }
         else if(arr[mid] > target){
             high = mid - 1;
         }
         else{
             low = mid + 1;
         }
     }

     return low;
}
  public static void main(String[] args){
    int arr[] ={1,3,4,5,6,7,9,12};
    int target= 10;
    search(arr,target);
  }
}
