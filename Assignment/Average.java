package Assignment;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        
    
    Scanner in = new Scanner(System.in);
    double subject = in.nextDouble();

    double totalMark = 0 ;
    for(int i = 1 ; i <= subject ; i ++){
        totalMark = totalMark + in.nextDouble();
    }

    double average = totalMark / subject ;
    System.out.println("Average = "+ average );
}
}
