package ArraysAndArrayLists;

import java.util.Scanner;
import  java.util.ArrayList ;

public class ArrayListExample {
   public static void main (String aa[]){
    Scanner in = new Scanner(System.in);

    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(1213);
    list.add(1234);
    list.add(1234);
    list.add(1266);
    list.add(123334);
    System.out.println(list);

    // I am taking input from user 
    for (int i = 0 ; i < 5 ; i++){
        list.add(in.nextInt());
    }
    //Output 
    for(int i = 0 ; i < 5 ; i ++){
        System.out.println(list.get(i));
    }
    System.out.println(list);
  }
    
}
