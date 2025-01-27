package ArraysAndArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayLisr {
    public static void main(String aaa[]){
        Scanner in = new Scanner( System.in );
        ArrayList<ArrayList<Integer>>list = new ArrayList<>();

        // Initialisation of multi Arraylist
        for (int i=0 ; i<3 ; i++){
            list.add(new ArrayList<>());
        }

        // output
        for(int i = 0 ; i<3 ; i++){
            for (int j = 0 ; j<3 ; j++ ){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
    
}
