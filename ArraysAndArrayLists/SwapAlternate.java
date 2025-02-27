package ArraysAndArrayLists;
import java.util.Arrays;
public class SwapAlternate{
    public static void main(String aa[]){
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