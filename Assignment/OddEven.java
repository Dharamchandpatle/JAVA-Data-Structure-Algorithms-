package Assignment;
// Write a program to print whether a number is even or odd, also take input from the user.
import java.util.Scanner;

public class OddEven {
    public static void main( String aa[]){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your number ");
        int n = in.nextInt();
        
        if (n % 2 == 0){
            System.out.println(" GIven number is even");
        }else{
            System.out.println("Given number is odd ");
        }
       
    }
    
}
