package Recursion;

public class TillingProblem {
    public static int countWays(int n) {
        if (n == 0) {
            return 1; // Base case: one way to fill a 0-length area
        }
        if (n < 0) {
            return 0; // No way to fill a negative length area
        }

        // Recursive case: place a tile vertically or horizontally
        return countWays(n - 1) + countWays(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(countWays(4)); // Example: number of ways to fill a 4-length area
    }
    
}
