import java.util.Scanner;

public class WhileLoop {
    public static void main(String aa[]) {
        Scanner in = new Scanner(System.in);

        // While loop 
        int n = in.nextInt();
        // int i = 1;
        // while ( i<= n ){
        //     System.out.print(i + " , ");
        //     i++;

        // }

        // DO While loop 
        int i = 1 ;
        do {
            System.out.print( i + " ");
            i++;
        }while(i<=n);



    }

}
