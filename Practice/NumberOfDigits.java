import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;

        int count = 0;
        while(n != 0 ){
            int n = n / 10 ;
            count++;
        }

        int div = (int)Math.pow(10, count-1);

        while(div != 0 ){
            int q = n / div ;
            System.err.println(q);

            n = n % div ;
            div = div / 10 ;

        }
    }
    
}
