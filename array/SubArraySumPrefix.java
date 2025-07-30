package array;

public class SubArraySumPrefix {

    public static void SubArraySumPrefix(int[] arr) {
        int n = arr.length;
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;

        // suffix sum of array
        int[] prefix = new int[n];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // start and end
        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < n; j++) {
                int end = j;

                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < currsum) {
                    maxSum = currsum;
                    // System.out.println("Subarray from index " + start + " to " + end + " has sum: " + currsum);
                }
            }
        }
            System.out.println("Maximum Subarray Sum: " + maxSum);

    }

    // kadanes algorithm
    public static void SubArraySumKadanes(int[] arr) {
        int cs = 0 ;
        int ms = Integer.MIN_VALUE;
        int n = arr.length;

        for(int i = 0 ; i< n ; i++){
            cs = cs + arr[i];
            if(cs < 0){
                cs = 0;
            }

            ms = Math.max(ms, cs);
        }
        System.out.println("Maximum Subarray Sum using Kadane's Algorithm: " + ms);
    }
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -1, 2, 1, -5, 4};
        SubArraySumKadanes(arr);
    }
}
