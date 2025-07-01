 package array;

import java.util.Scanner;

public class transposeMatrix {
    
    public static void PrintMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int [][] transposeMatrix(int[][] arr , int r, int c) {
        int[][] transpos = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                transpos[j][i] = arr[i][j];
            }
        }
        return transpos;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Original Matrix:");
        PrintMatrix(arr);
        
        int[][] transposed = transposeMatrix(arr, r, c);
        
        System.out.println("Transposed Matrix:");
        PrintMatrix(transposed);
    }
}
