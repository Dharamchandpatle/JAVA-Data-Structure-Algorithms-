package Assignment;

import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String aaa[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your numbers average calculate : ");
        int n = in.nextInt();
        double sum = 0 ;

        double []num = new double[n];
        for(int i=0 ; i<n ; i++){
            num[i]= in.nextDouble();
             sum  += num[i];
            
        }
        double average = sum / n;
        System.out.println("Average = "+average);
    }
    
}
