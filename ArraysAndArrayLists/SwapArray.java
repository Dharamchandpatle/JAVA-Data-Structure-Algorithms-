package ArraysAndArrayLists;

import java.util.Arrays;

public class SwapArray {
    public static void main(String aa[]){
        int arr[] = {1,2,45,77,8,34};
        // swap(arr , 0 , 4);

        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

   static void swap(int arr[], int index1,int index2){
    int temp  = arr[index1];
    arr[index1] = arr[index2];
    arr[index2]  = temp ;
   }

   static void reverse (int arr[]){
    int start = 0;
    int end = arr.length-1 ;
    swap(arr, start,end);
    start ++ ;
    end--;
   }
    
}
