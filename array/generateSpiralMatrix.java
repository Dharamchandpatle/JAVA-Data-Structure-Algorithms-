package array;

public class generateSpiralMatrix {
    static void PrintMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] generateSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];
        int toprow = 0;
        int rightcol = n - 1;
        int bottomrow = n - 1;
        int leftcol = 0;
        int curr = 1;

        while (curr <= n*n){
            // Print top row
            for(int j = leftcol ; j<= rightcol  && curr <= n*n ; j++){
                matrix[toprow][j] = curr++ ;
            }
            toprow++ ;

            //print right column 
            for(int i = toprow ; i <= bottomrow && curr <= n*n ; i++){
                matrix[i][rightcol] = curr++ ;
            }
            rightcol-- ;

            // print bottom row 
            for(int j= rightcol ; j >= leftcol && curr <= n*n ; j--){
                matrix[bottomrow][j] = curr++ ;
            }
            bottomrow-- ;

            // print left column
            for(int i = bottomrow ; i >= toprow && curr <= n*n ; i--){
                matrix[i][leftcol] = curr++ ;
            }
            leftcol++ ;      
        }

        return matrix ;
    }

    public static void main(String[] args) {
        int n = 4; // Example size of the spiral matrix
        int[][] spiralMatrix = generateSpiralMatrix(n);
        PrintMatrix(spiralMatrix);
    }
}
