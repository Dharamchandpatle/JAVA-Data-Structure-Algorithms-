package Assignment;

import java.util.Scanner;

public class FibonnaciSeries {
    public static void main(String aa[]) {
        int a = 0, b = 1;
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        int n = 10;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + ",");

            int c = a + b;
            a = b;
            b = c;
        }
    }

}
