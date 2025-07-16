package array;

import java.util.Arrays;

public class rowWiseSum {
    public static void SumRowWise(int [][] matrix){

        int m = matrix.length ;
        int n = matrix[0].length ;

        int []result = new int [m];

        for(int i = 0 ; i< m; i++){
            int sum =0;
            for(int j =0;j< n; j++){
               sum += matrix[i][j];
            }

            result[i] = sum ;
        }

        for(int i = 0; i < m; i++) {
            System.out.println("Sum of row " + i + " = " + result[i]);
        }
    }
   
   
    public static void SumcolWise(int [][] matrix){
        int m = matrix.length ;
        int n = matrix[0].length ;

        int []result = new int [n];

        for(int j = 0 ; j< n; j++){
            int sum =0;
            for(int i =0;i< m; i++){
               sum += matrix[i][j];
            }

            result[j] = sum ;
        }

        for(int i = 0; i < n-  1; i++) {
            System.out.println("Sum of col " + i + " = " + result[i]);
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3} , {5,6,7} , {1,2,3}};
        SumRowWise(matrix);
        SumcolWise(matrix);


    }
}

