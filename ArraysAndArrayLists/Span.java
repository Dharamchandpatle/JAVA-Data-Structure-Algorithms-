package ArraysAndArrayLists;

import java.util.Scanner;

public class Span {
    public static void main(String[] args) {
        int n = sc.nextInt() ;
        int[] arr = new int[n];
        
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        int ind = -1 ;
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]== ind){
                ind = i ;
                break ;
            }
        }
        System.out.println(ind);
        
    
    }
}
