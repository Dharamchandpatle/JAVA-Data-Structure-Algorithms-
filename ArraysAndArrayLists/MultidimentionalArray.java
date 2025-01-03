package ArraysAndArrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimentionalArray {
    public static void main(String aa[]){
        Scanner in = new Scanner(System.in);

    int [][]arr = new int[3][3];
 // INput
    for ( int row = 0 ; row < arr.length ; row++){
        for(int col =0 ; col < arr[row].length ; col++){
            arr[row][col]= in.nextInt();
        }
    }

    // Output 
    for ( int row = 0 ; row < arr.length ; row++){
        for(int col =0 ; col < arr[row].length ; col++){
            System.out.print(arr[row][col]+" ");
        }
        System.out.println();
    }
    // Output 
    for ( int element[] : arr){
       System.out.println(Arrays.toString(element));
    }

    
}
    
}
