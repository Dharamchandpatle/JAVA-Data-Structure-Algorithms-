package array;

public class largestSum2D {
    
    public static int largestSum(int[][] mat , int rows , int cols ){
        int max = Integer.MIN_VALUE;
        int rowIndex =-1;

        for(int i = 0 ; i < rows ; i++ ){
            int sum = 0 ;
            for(int j = 0 ; j< cols ; j++){
                sum += mat[i][j];
            }
            if(sum > max){
                max = sum ;
                rowIndex = i ;
            }
        }
        System.out.println("max = "+max);
        return rowIndex ;
    }

    public static void main(String[] args) {
         int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int rowIndex = largestSum(matrix , 3,3);
        System.out.println( "rowIndex = " + rowIndex);
    }
}
