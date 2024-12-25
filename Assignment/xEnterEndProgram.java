package Assignment;

import java.util.Scanner;

//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all
public class xEnterEndProgram {

    public static void main (String aa[]){
        Scanner in = new Scanner(System.in);
        int sum = 0;

        System.out.println("ENter number do sum if you type x end the program and print the sum ");

        while(true){
            String input = in.next();

            if (input.equals("x")){
                break;
            }

            int number = Integer.parseInt(input);
            sum = sum+number ;

        }
        System.out.println("sum = "+ sum);
    }
    
}
