import java.util.Scanner;

public class CountNumber {
    public static void main (String aa[]){
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        int n = 4555325 ;
        int count = 0 ;
        while(n > 0 ){
           int rem = n % 10 ;
            if( rem == 3 ){
                count ++;
            }
            n = n/10 ;
            
        }
        System.out.println(count);


    }
    
}
