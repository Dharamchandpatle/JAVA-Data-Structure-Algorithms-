package ArraysAndArrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfObjects {
    public static void main(String aa[])    
    {
        Scanner in = new Scanner(System.in);
        // String str = in.nextLine();

        String []str = new String[4];

        for (int i = 0 ; i<str.length ; i++){
            str[i]=in.nextLine();
        }
       
            System.out.println(Arrays.toString(str));
        

        // for(String strr : str){
        //      System.out.print(strr+" ");
        //     System.out.print(Arrays.toString(strr));
        // }


    }
}
