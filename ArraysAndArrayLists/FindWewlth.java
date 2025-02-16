public class FindWewlth {
    
    public static void main(String aa[]) {
        int[][] accounts = {
                { 1, 2, 3, 4, 4, 5 },
                { 6, 7, 8, 9 },
                { 10, 11, 22, 33, 44 }
        };

        System.out.println(maximumWealth(accounts));

    }

        public static int maximumWealth(int[][] accounts) {
            int ans = Integer.MIN_VALUE;
            for (int[] ints : accounts) {
                int sum = 0;
                for (int ansInt : ints) {
                    sum += ansInt;
                }
                if (sum > ans) {
                    ans = sum;
                }
            }
            return ans;
        }
    }

