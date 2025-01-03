package ArraysAndArrayLists;

import java.util.Arrays;

public class ArrayInFunction {

    public static void  main(String aa[]){
        int []nums = {1,2323,435345,6,457,567};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void change(int []arr){
        arr[0]=99;
    }
    
}
