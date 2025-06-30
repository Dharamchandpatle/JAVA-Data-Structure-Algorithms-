package array;

public class Multiplication2Darray {
    
     static void PrintMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

     public static void Multiplication2Darray(int [] [] a , int r1 , int c1 , int[][] b , int r2 , int c2) {
        if (r1 != c2) {
            System.out.println("Matrix multiplication not possible");
            return;
        }
        
        int[][] result = new int[r1][c2];
        
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for(int k = 0 ; k<c1 ; k++){
                    result[i][j] += a[i][k] * b[k][j];
                }

            }
        }
        
        PrintMatrix(result);
    }

     public static void main(String[] args) {
        int[][] a = { {1, 2, 3}, {4, 5, 6} };
        int[][] b = { {7, 8}, {9, 10}, {11, 12} };
        
        Multiplication2Darray(a, 2, 3, b, 3, 2);
    } 
}
