package Assignment;

import java.util.Scanner;

public class Discounte {
    public static void main(String aa[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter original price : ");
        double orgPrice = in.nextFloat();

        System.out.print("Enter your discount price : ");
        double disPrice = in.nextDouble();

        double discount = orgPrice *(disPrice / 100 );

        System.out.print( "Discount = "+ discount);
    
    }
    
    
}
