package ArraysAndArrayLists;

import java.util.Arrays;

public class NoFixedCol {
    public static void main(String aa[]){
        int [][]arr = {
            {1,2,3,4,5,6,6,6},
            {2,24,4,4,6,77,87,6776,65},
            {2,3,4,5,56,}
        };

        //Output 
        for ( int row = 0 ; row < arr.length ; row++){
            for(int col = 0 ; col < arr[row].length ; col++){
                System.out.print(arr[row][col] + " " );
            }
            System.out.println();
        }
        for ( int []element : arr){
            System.out.println(Arrays.toString(element));
        }
    }
    
}
