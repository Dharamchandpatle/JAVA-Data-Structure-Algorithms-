package array ;

import java.util.Arrays;

public class prefixSum{
    public static int [] prefixSumm(int []arr){
        int n = arr.length;
        int []pref = new int[n];
        pref[0] = arr[0] ;

        for(int i =1 ; i< n ; i++){
            pref[i] = pref[i-1] + arr[i];
        }
        return pref ;
    }

    public static void main(String[] args) {
        int [] arr = {1,9,3,8,5,6,7};

        int []ans = prefixSumm(arr);
        System.out.println(Arrays.toString(ans));
    }
}