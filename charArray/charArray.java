package charArray;

import java.util.Scanner;

public class charArray {
    public static void main(String[] args) {
        char[] charArray = new char[20];

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        charArray[2] = '\0';
        // Convert the string to a character array
        charArray = name.toCharArray();
        
        // Print the character array
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + " ");
        }
        
    }
}
