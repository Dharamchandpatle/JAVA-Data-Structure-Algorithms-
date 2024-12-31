package Assignment;

import java.util.Scanner;

public class DistanceTwoPoints {
    public static void main( String a[]){
        Scanner in = new Scanner(System.in);

        System.out.print(" X1 = ");
        int x1 = in.nextInt();
        

        System.out.print(" y1  = ");
        int x2 = in.nextInt();

        System.out.print(" y1 = ");
        int y1 = in.nextInt();

        System.out.print(" y2 = ");
        int y2 = in.nextInt();

        // int total = ((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1));
        // double point = Math.sqrt(total);

        double point = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println(" Distance bw two points = "+ point);



    }
    
}
