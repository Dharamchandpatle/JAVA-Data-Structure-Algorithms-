package array;

import java.util.Arrays;

public class KstepRotate {

     public static void reverseArr (int [] arr , int start , int end ){
       

        while (start < end ) {
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp ;
                    start ++ ;
                    end-- ;
        }
    }


     public static void KstepRotateArray(int[] arr, int k) {
        int n = arr.length;
      
        k = k % n;
      
        reverseArr(arr , 0 ,n-k-1 );
        reverseArr(arr , n-k ,n-1 );
        reverseArr(arr , 0 ,n-1 );
       
       
       
    }

    // public static void KstepRotateArray(int []arr , int k ){
    //  int n = arr.length;
    //  int j = 0 ;
    //  k = k % n ;
    //  int [] ans = new int[n];
    //  for ( int i = n-k ; i< n-1 ; i++){
    //     ans[j++] = arr[i];
    //  }
    //  for(int i = 0 ; i< n-k ; i++){
    //     ans[j++] = arr[i];
    //     }
       
    //    for(int i = 0 ; i<n ; i++){
    //         arr[i] = ans[i];
    //     }
    // }

    public static void main(String[] args) {
        int []arr = {3,43,5,6,6,77,3,22,2};
        int k = 4 ;
        KstepRotateArray(arr , k);
        System.out.println(Arrays.toString(arr));

    }
    
}
