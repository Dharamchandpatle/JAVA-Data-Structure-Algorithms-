package Assignment;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String aa[]) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }


        if ( sum == num ){
            System.out.println(num + " is perfect number ");
        }
        else{
            System.out.println(num + " is not perfect number ");

        }
    }

}
