package Assignment;

import java.util.Scanner;

public class Vovel_Consonant {
    public static void main(String aa[])
    {
        Scanner in = new Scanner(System.in);
        char ch = in.next().toLowerCase().charAt(0);

        if (ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ){
            System.out.println( "Given alphabet is vowel ");
        }
        else if (ch >= 'a' && ch <= 'z'){
            System.out.println( "GIven alphaber is consonant ");
        }
        else{
            System.out.println("Invalid ");
        }

    }
    
}
