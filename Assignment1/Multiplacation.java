//Take a number as input and print the multiplication table for it.
package Assignment1;

import java.util.Scanner;

public class Multiplacation {
    public static void main(String aa[]){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for(int i = 1; i<=10 ; i++){
            int t = i * n ;
            System.out.println(i +"x"+n +"="+ t);
        }



    }
    
}
