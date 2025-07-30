package Recursion;

public class Power {
    static int pow(int p , int q){
        // base case 
    if(q==0) return 1 ;

    return pow(q , p-1) *p;
    }
    public static void main(String[] args) {
        System.out.println(pow(2,4));
    }
}
