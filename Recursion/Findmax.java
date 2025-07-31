package Recursion ;

public class Findmax {
    static int Findmax(int [] arr , int idx){
        if(idx == arr.length - 1){
            return arr[idx];
        }

        int smallans = Findmax(arr , idx+1) ;
        return Math.max(smallans, arr[idx]);
    }

    public static void main(String[] args) {
        int []arr = {2,4,5,6,78,99,0};
        System.out.println(Findmax(arr , 0));
    }

    
}
