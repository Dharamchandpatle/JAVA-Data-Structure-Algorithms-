package array;

import java.util.Scanner;

public class sumOfRectangle2D {
  public static void findprefixSum(int [][] matrix){
    int r = matrix.length;
    int c = matrix[0].length ;
    for(int i = 0;i< r ; i ++){
        for(int j =0 ; j< c ; j++){
            matrix[i][j] += matrix[i] [j-1 ];
        }
    }

  }

  public static int findSum(int [][] matrix , int r1 ,int l1 , int r2 , int l2 ){
     int sum =0 ;

     for(int i = l1 ; i<= l2 ; i++){
        if(r1 >= 1){
            sum += matrix[i] [r2]-matrix[i][r1-1] ;

        }else{
            sum += matrix[i][r2];
        }
     }
     return sum ;
  }


  public static void main(String[] args) {
    int [][] matrix = { {1,2,3}, {3,4,5} ,{7,8,9}};

    System.out.println(findSum(matrix, 0, 0, 0, 0));
  }
}
