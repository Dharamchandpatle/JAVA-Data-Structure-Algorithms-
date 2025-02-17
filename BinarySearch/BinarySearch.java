package BinarySearch;

public class BinarySearch {
    public static void main(String aa[]){
        int[] arr = {-32,-3,0,3,44,55,66,77,88,90};
        int target = 44;
        int ans = binarySearch(arr , target);
        System.out.println((ans));
    }
    static int binarySearch(int[]arr , int target){
        int start = 0;
        int end= arr.length-1 ;

        while(start <= end){
            int mid = start +(end - start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            }
            else if ( target < arr[mid]){
                end = mid-1 ;
            }
            else {
                return mid ;
            }
        }
        return -1 ;
    }
}
