package array;
// This code is a placeholder for the Addition2DArray class.
// It currently does not contain any methods or properties.
public class Addition2DArray {
    
    static void PrintMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void addMatrix(int [] [] a , int r1 , int c1 , int[][] b , int r2 , int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Matrix addition not possible");
            return;
        }
        
        int[][] result = new int[r1][c1];
        
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        
        PrintMatrix(result);
    }
    
    public static void main(String[] args) {
        int[][] a = { {1, 2, 3}, {4, 5, 6} };
        int[][] b = { {7, 8, 9}, {10, 11, 12} };
        
        addMatrix(a, 2, 3, b, 2, 3);
    }   
}
