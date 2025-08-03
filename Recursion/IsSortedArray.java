package Recursion;

public class IsSortedArray {
    static boolean isSorted(int []arr , int i){
        if (i == arr.length - 1) {
            return true; // Base case: if we reach the last element, the array is sorted
        }

        if(arr[i] > arr[i+1]){
            return false ;
        }else{
            return isSorted(arr, i + 1); // Recursive case: check the next pair of elements
        }
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        boolean ans = isSorted(arr, 0);
        System.out.println(ans); 

        int [] arr2 = {1, 3, 2, 4, 5};
        boolean ans2 = isSorted(arr2, 0);
        System.out.println(ans2); 
    }
    
}
