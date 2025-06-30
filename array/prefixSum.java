package array ;

import java.util.Arrays;
import java.util.Scanner;

public class prefixSum{
    public static int [] prefixSumm(int []arr){
        int n = arr.length;
        // int []pref = new int[n];
        // pref[0] = arr[0] ;

        for(int i =1 ; i< n ; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr ;
    }

    public static void main(String[] args) {
        int [] arr = {1,9,3,8,5,6,7};

        int []ans = prefixSumm(arr);
        System.out.println(Arrays.toString(ans));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queries : " );
        int q = sc.nextInt();

        while (q-- >0 ) {
            System.out.print("Enter your range : ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int anss = ans[r] - ans[l-1];
            System.out.println("ans = "+ anss);
            
        }
    }
}