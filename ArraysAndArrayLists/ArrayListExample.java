package ArraysAndArrayLists;

import java.util.Scanner;
import  java.util.ArrayList ;

public class ArrayListExample {
    public static void main (String aa[]){
        Scanner in =  new Scanner ( System.in);

        ArrayList <Integer> list = new ArrayList<>(5);
        // list.add(10);
        // list.add(130);
        // list.add(1033);
        // list.add(4410);
        // list.add(14044);
        // list.add(10444342);

        // System.out.println(list);

        // list.remove(2);
        // System.out.println(list);

        // System.out.println(list.contains(10));

        // Take input 
        for ( int i = 0 ; i<5 ; i++){
            list.add(in.nextInt());
        }

        //Output 
        for( int i =0 ; i < 5 ; i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);

    }
    
}
