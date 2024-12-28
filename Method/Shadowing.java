package Method;

public class Shadowing {
     static int x = 10 ;

    
    public static void main (String aa[])
    {
        System.out.println(x);
        int x ;
        x= 10000;
        System.out.println(x);
        show();


    }
     static void show ()
    {
        // int x =1000;
        System.out.println(x);
    }
    
}
