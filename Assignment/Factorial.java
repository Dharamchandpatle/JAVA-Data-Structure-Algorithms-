//Factorial Program In Java
package Assignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String aa[])
    {
        int fact = 1 ;
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for( int i = 1 ; i<= num ; i++){
            fact = fact * i ;

        }
        System.out.print("Factorial = " +fact );

    }
}
