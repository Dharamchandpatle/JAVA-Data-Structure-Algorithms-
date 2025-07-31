package Recursion;

public class PrintTheArray {
    static int print(int [] arr , int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }

        // print  the array
      int smallans =   print(arr, idx + 1);
    return(smallans + arr[idx]);

    }
    public static void main(String[] args) {
       int []arr = {2,4,5,6,78,99,0};
        System.out.println(print(arr , 0));
    }
}
