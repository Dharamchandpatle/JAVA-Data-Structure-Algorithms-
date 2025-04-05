import java.util.Scanner;

public class countNumber12 {
    public static void main(String aa[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0 ;
        while(n != 0){
            n = n /10 ;
            count ++ ;
        }
        // return c ;
    }
}
