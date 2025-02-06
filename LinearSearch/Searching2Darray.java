package LinearSearch;

import java.util.Arrays;

public class Searching2Darray {
    public static void main(String ss[]){
        int [][]arr = {
            {1,2,45,77,8,34},
            {1,2,45,77,8,34},
            {1,2,45,77,8,34},
            {1,2,45,77,8,34},
        };
        int target = 77 ;
        int[] ans = search(arr , target); // formate of return value {row , col}
        System.out.println(Arrays.toString(ans));

        System.out.println(maxvalue(arr));
    }

    // Searching in 2D array 
    static int[] search(int [][]arr , int target)
    {
        for(int row = 0 ; row< arr.length ; row++){
            for(int col = 0 ; col< arr.length ; col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    // Finding maximam in 2D array 
    static int maxvalue(int [][]arr)
    {
        int max = Integer.MIN_VALUE;
        for(int row = 0 ; row< arr.length ; row++){
            for(int col = 0 ; col< arr.length ; col++){
                if(arr[row][col]> max){
                   max = arr[row][col];
                }
            }
        }
        return max;
    }
    
}
