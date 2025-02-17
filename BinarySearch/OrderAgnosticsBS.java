package BinarySearch;

public class OrderAgnosticsBS {
    public static void main(String aa[]){
        int[] arr = {99,88,77,66,55,44,33,22,11,1};
        // int[] arr = {-32,-3,0,3,44,55,66,77,88,90};

        int target = 88;
        int ans = orderAgnosticBS(arr , target);
        System.out.println((ans));
    }

    static int orderAgnosticBS(int[] arr , int target){
        int start = 0 ;
        int end = arr.length - 1 ;

        // find weather the array is sorted in assending or discending 
        boolean isAsc = arr[start] < arr[end];

            while (start <= end){
                int mid = start + (end-start)/2;
                if(arr[mid] == target){
                    return mid ;
                }

                if(isAsc){
                    if(target <arr[mid]){
                        end = mid-1 ;
                    }
                    else {
                        start = mid+1;
                    }
                }else{
                    if(target> arr[mid]){
                        end = mid-1;
                    }
                    else{
                        start = mid+1 ;
                    }
                }
            }
        return -1 ;

    }
}
