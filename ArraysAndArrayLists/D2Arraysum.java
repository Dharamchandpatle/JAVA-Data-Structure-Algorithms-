import java.util.Arrays;

public class D2Arraysum {
    public static void main(String aa[]){
        int [][] matrix = {
            {1,2,3,4,4,5},
            {6,7,8,9},
            {10,11,22,33,44}
        };

        System.out.println(findMaxArray(matrix));
        
    }
    public static int findMaxArray(int[][] matrix){
        // int sum = 0 ;
        // for(int[] row : matrix){
        //     for(int col : row){
        //         sum += col ;
        //     }
        // }
        
        int ans = Integer.MIN_VALUE;
        int sum = Arrays.stream(matrix).flatMapToInt(Arrays::stream).sum();
        // System.out.println(sum);
        
        if(sum>ans){
            ans = sum ;
        }
       return sum ;

    }

}
