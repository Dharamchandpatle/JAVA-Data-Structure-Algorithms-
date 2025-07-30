package Recursion;

public class SumOfDigit {
    static int sod(int n ){
        //Base case 
        if(n>0 && n<9 ){
            return n ;
        }
        return sod(n/10) + n % 10 ;
    }
    public static void main(String[] args) {
        System.out.println(sod(123456789));
    }
}
