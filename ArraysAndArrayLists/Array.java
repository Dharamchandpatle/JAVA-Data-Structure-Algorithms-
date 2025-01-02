package ArraysAndArrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main (String aa[])
    {
        Scanner in = new Scanner(System.in);

        // Array of primitives 

        int []arr = new int[5];
        arr [0]=10;
        arr [1]=110;
        arr [2]=102;
        arr [3]=103;
        arr [4]=104;

        System.out.print(arr[0]);

        // For loop 
        
        for (int i = 0 ; i<arr.length ; i++){
            arr[i]= in.nextInt();
        }
        for (int i = 0 ; i<arr.length ; i++){
          System.out.print(arr[i]+" ");
        }

        // For each 
        for(int num : arr){
          System.out.print(num + " ");

        }

        //Best format printing the array 
        System.out.print(Arrays.toString(arr));


    // Array of objects 
    

    }
    
}
