package Recursion;

public class LinearSearch {
    static boolean linear(int[] arr , int target ,int n ,  int idx){
        //Base case 
        if(idx >= n ) return false;
        
        // self work 
        if(arr[idx] == target) return true ;

        // small / recursive work 
       return linear(arr, target,n, idx+1);

    }
    public static void main(String[] args) {
        int [] arr = {12,3,5,6,8,0,5,2,1};
        int target = 8;
        if(linear(arr, target,arr.length, 0)){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
    
}
