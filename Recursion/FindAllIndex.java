package Recursion;

import java.util.Arrays;

public class FindAllIndex {
    static int[] findIndex(int[] arr, int target) {
        int[] ans = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans[k++] = i;
            }
        }
       return Arrays.copyOfRange(ans, 0, k);

    }
    public static void main(String[] args) {
        int [] arr = {8,3,8,8,4};
        int target = 8 ;
        int []ans = findIndex(arr, target); 
        System.out.println(Arrays.toString(ans));
    }

}
