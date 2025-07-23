package array ;
public class SubArraySum {
    public static void SubArraySum(int[]arr){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i =0 ; i<arr.length ; i++){
            for(int  j =i ; j<arr.length ; j++){
                currentSum = 0 ;
                for(int k = i ; k < j ; k++){
                    currentSum += arr[k];
                }
                if(maxSum <= currentSum){
                    maxSum = currentSum;
                }
                System.out.println("Subarray from index " + i + " to " + j + " has sum: " + currentSum);
            }
        }
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
    public static void main(String[] args) {
        int [] arr = {1, -2, 3, 4, -1, 2, 1, -5, 4};
        SubArraySum(arr);
    }
}
