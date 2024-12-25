package Method;

import java.util.Scanner;

public class Method1 {
    public static void main (String aa[]){
        SumVoid();

        // int ans = returnsunm();
        // System.out.println(ans);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter name =");
        String naam = in.nextLine();

        String s = returnStrinfType( naam);
        System.out.println(s);

    }
    // String return type 

    static String returnStrinfType( String name ){
        String str = "Hello "+ name ;
     return str  ; 
    }
    
    // ( Int )Return Type.....

    // static int returnsunm(){

    //     Scanner in = new Scanner(System.in);
    //         int a = in.nextInt();
    //         int b = in.nextInt();
    
    //         int sum = a + b ;

    //         return sum ;
    //         // System.out.print(sum);
    

    // }


    // No return type .........

    static void SumVoid(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int sum = a + b ;

        System.out.println(sum);

    }
}
