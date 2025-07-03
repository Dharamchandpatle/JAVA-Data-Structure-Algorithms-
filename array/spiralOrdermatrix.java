package array;

import java.util.Scanner;

public class spiralOrdermatrix {
    static void PrintMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

 public   static void printspiralMatrix(int[][] matrix, int r, int c) {
        int toprow = 0 ; 
        int rightcol = c-1 ; 
        int bottomrow = r-1 ;
        int leftcol = 0 ;
        int totalElements = 0;

        while(totalElements < r*c){
            // Print top row
            for(int i = leftcol ; i <= rightcol && totalElements < r*c ; i++){
                System.out.print(matrix[toprow][i] + " ");
                totalElements++;
           } 
           toprow++;

           // print left column 
           for(int j = toprow ; j<= bottomrow && totalElements < r*c ; j++){
            System.out.print(matrix[j][rightcol] + " ");
            totalElements++;
           }
              rightcol--;
              
           // print bottom row
              for(int i = rightcol ; i >= leftcol && totalElements < r*c ; i--){
                System.out.print(matrix[bottomrow][i] + " ");
                totalElements++;
              }
                bottomrow--;
                
           // print left column
                for(int j = bottomrow ; j >= toprow && totalElements < r*c ; j--){
                System.out.print(matrix[j][leftcol] + " ");
                totalElements++;
                }
                leftcol++;

        }

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.println("Enter number of rows and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Spiral order of the matrix:");
       printspiralMatrix(matrix, r, c);
        
        // System.out.println("Matrix printed successfully");
        // PrintMatrix(matrix);    
    }
    

}

