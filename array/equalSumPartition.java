package array;

public class equalSumPartition {
    
    public static int findSum (int [] arr){
        int sum = 0 ; 
        for(int i =0 ; i< arr.length ; i ++){
            sum += arr[i];
        }
        return sum ; 
    }


    public static boolean equalSumPartition(int [] arr){
         int sumArray = findSum(arr);
         int prefixSum =  0 ;
        //  int sufixSum = 0 ;
         for(int i =0 ; i<arr.length  ; i++){
            prefixSum += arr[i];
           int  sufixSum =  sumArray - prefixSum  ; 

            if (sufixSum == prefixSum){
                return true ; 
            }
            
         }
         return false ; 
    }

    public static void main(String[] args) {
        // int []arr = {1,2,3,4,5,6} ;
        int []arr = {1,1,1,1,1,1,1,1};

       System.out.println(equalSumPartition(arr));
    }
}
