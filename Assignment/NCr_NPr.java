package Assignment;

import java.util.Scanner;

public class NCr_NPr {
    public static void main(String aa[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.print("Enter R: ");
        int R = in.nextInt();

        // Calculate NCr and NPr
        long nCr = factorial(N) / (factorial(R) * factorial(N - R));
        long nPr = factorial(N) / factorial(N - R);

        System.out.println("NCr = " + nCr);
        System.out.println("NPr = " + nPr);

    }

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
