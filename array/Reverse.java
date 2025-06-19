package array;

import java.util.Arrays;

public class Reverse {
    public static void ReverseArray (int [] arr){
        int start =0 ;
        int end = arr.length - 1;

        while (start < end ) {
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp ;
                    start ++ ;
                    end-- ;
        }
    }
    public static void main(String[] args) {
        int []arr = {1,3,4,5,6,78,9,9};

         ReverseArray(arr);
    //    for(int ans : arr){
         System.out.println(Arrays.toString(arr));
    //    }
    }
}
