package Recursion;

public class PrintMultiplies {
    static void printMultiplies(int n , int k ){
        // base case 
        if( k == 0) return ;

        // Recursive work 
        printMultiplies(n , k -1 );
        
        // self work 
        System.out.println(n * k);
    }
    public static void main(String[] args) {
        printMultiplies(5,4);
    }
    
}
