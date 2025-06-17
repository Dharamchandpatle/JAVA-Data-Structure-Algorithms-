import java.util.*;

public class Main {
    public static void main(String[] args) {
      int[] arr = {0,1,1,0,0,1} ;
       sortArr(arr , arr.length );
      // System.out.println(arr);
  }
  
  public static void sortArr(int[] arr , int n ){
    
    int i = 0; 
    int  j = n - 1 ;
    
    while(i<j){
      while(arr[i] == 0 && i<j){
        i++ ;
      }
      // System.out.println(arr);
      while(arr[j] == 1 && i < j){
        j-- ;
      }
    // System.out.println(arr);
      if(i<j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp ;
        
        i++ ;
        j-- ;
      }
    // System.out.println(arr);
    }
    for(int nums : arr){
      System.out.print(nums + "  ");
    }
  }
}