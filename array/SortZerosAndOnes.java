package array ;

import java.util.Arrays;

public class SortZerosAndOnes {
    public static void sortZeroandOnes(int [] arr){
        int e= arr.length-1 ; 
        int s = 0 ; 

        for(int i =0 ; i < e ; i ++){
            while (s<e){
                if(arr[s]== 1 && arr[e]==0 ){
                    int temp = arr[s];
                    arr[s] = arr[e];
                    arr[e] = temp;

                    s++ ;
                    e-- ;
                }
                if(arr[s] == 0){
                    s++ ;
                }
                if(arr[e] == 1){
                    e-- ;
                }

            }
        }

    }

    public static void main(String[] args) {
        int [] arr = {1,0,1,0,1,0,1,0,1,0};
        sortZeroandOnes(arr);
        // for(int i = 0 ; i < arr.length ; i++){
        //     System.out.print(arr[i] + " ");
        // }
        System.out.println(Arrays.toString(arr));
    }
} 
