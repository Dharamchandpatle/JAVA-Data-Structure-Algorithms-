package array;

import java.util.Scanner;

public class Targetsum1 {

    // pair sum 
    // public static int pairSum(int [] arr , int target ){
    //     int ans = 0 ;
    //    for(int  i =0 ; i< arr.length ; i++){
    //     for(int j = i+1 ; j< arr.length  ; j++){
    //         if(arr[i] + arr[j] == target){
    //          ans ++ ;
    //         }
    //     }
    //    }
    //    return ans ;
    // }


// find unique element 
// public static int findUnique(int []arr ){

//     for(int  i =0 ; i< arr.length ; i++){
//         for(int j = i+1 ; j< arr.length  ; j++){
//             if(arr[i] == arr[j]){
//              arr[i]= -1 ;
//              arr[j]= -1 ;

//             }
//         }
//        }

//        int ans = -1 ;
//        for(int i = 0 ; i< arr.length ; i++){
//         if(arr[i]> 0 ){
//             ans = arr[i];
//         }
//        }
//        return ans ;

// }

// Find the second largest element of given  array 
public static int findMax(int []arr){
    int max = arr[0] ;
   int n = arr.length;
//    int ans = 0;
    for(int i = 0 ; i<n ; i++ ){
        if(max < arr[i] ){
            max = arr[i];
        }
    }
    return max ;
}

// Find second Largest element 
public static int FindSecond(int []arr){
   int n = arr.length;
 int max =  findMax(arr);

    for(int i =0 ; i <n ; i++){
        if(arr[i] == max){
            arr[i] = Integer.MIN_VALUE;
        }
    }

   int secondElement = findMax(arr);
    return secondElement ;
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.println("enter number or element ");
        int n = sc.nextInt() ;

        int [] arr  = new int[n];

        // System.out.println("enter target");
        // int target = sc.nextInt();

        System.out.println("enter Array Element ");
        for(int i = 0 ; i< arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        // System.out.println(pairSum(arr, target )); ;
        // System.out.println(findUnique( "Answer = "+arr )); ;
        // System.out.println( "FindSecond largest element  = " +(findMax(  arr) )); ;
        System.out.println( "FindSecond largest element  = " + (FindSecond(  arr) )); 
    }
}
