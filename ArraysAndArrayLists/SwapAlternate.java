package ArraysAndArrayLists;
import java.util.Arrays;
public class SwapAlternate{
    public static void main(String aa[]){
        // public static void main(String[] args) {
        //     int []arr = {12,9,4,6,8,5,3,7};
            
        //   int n = arr.length -1;
        //   for(int i =0;i< n; i+=2){
            
        //    // if(arr[i+1]<n){
        //       int temp = arr[i];
        //       arr[i]= arr[i+1];
        //       arr[i+1] = temp ;
              
        //    // }
        //   }
          
        //   for(int val : arr){
        //     System.out.print(val + " ");
        //   }
        
        //  }

        
        int[] arr = {3,4,56,7,7,88,9,9};
         searchAlternate(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void searchAlternate(int[]arr ){
        int length = arr.length;
        for(int i =0; i< length ; i=i+2){
            if(i+1 < length){
                swap(arr, i , i+1);
            }
        }

    }
    public static void swap(int[] arr , int i , int j) {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp ;
    }
}