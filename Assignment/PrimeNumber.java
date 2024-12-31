package Assignment;

import java.util.Scanner;

public class PrimeNumber {
     public static void main(String aa[])
     {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        boolean ans = isPrimeNumber(n);
        System.out.println(ans);
     }
    
     public static boolean isPrimeNumber(int n){
        if ( n <= 1 )
        {
            return false ;
        }
        int c = 2 ;
        while (c*c <= n)
        {
            if ( n%c == 0){
                return false ;
            }
            c++ ;
        }
        return c*c >= n ;
     }
}
