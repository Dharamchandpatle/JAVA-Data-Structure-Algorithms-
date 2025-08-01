package Recursion;

import java.util.Arrays;

public class FindAllIndex {
    // Iterative method 
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


    // Recursion Method 
    static int findAllIndices(int []arr , int target , int n , int idx){
        // Base case 
        if( idx >= n){
            return 0;
        }
        // self work 
        if(arr[idx] == target ){
            System.out.println(idx);
        }
        // Recursive work 
       return findAllIndices(arr, target, n, idx+1);
    }
    public static void main(String[] args) {
        int [] arr = {8,3,8,8,4};
        int target = 8 ;
        int n = arr.length;
        // int []ans = findIndex(arr, target); 
        // System.out.println(Arrays.toString(ans));

        System.out.println(findAllIndices(arr, target, n, 0));
    }

}
