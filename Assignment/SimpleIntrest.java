package Assignment;
//ake name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class SimpleIntrest {
    public static  void main (String aa[]){
      Scanner in = new Scanner(System.in);

      System.out.print("Enter your Principle : ");
      float p = in.nextFloat();

      System.out.print("Enter your Rste :");
      float r = in.nextFloat();

      System.out.print(" Enter your time : ");
      float t = in.nextFloat();

      float SI = (p*r*t)/100;

      System.out.print("SI = "+SI);

    }
    
}
