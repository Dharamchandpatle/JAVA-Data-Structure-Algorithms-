package Method;

public class Swap {

public static void main(String aa[]){
    // int a = 10 ;
    // int b= 20 ;

    // int temp = a ;
    // a = b ;
    // b= temp ;
    Swap s = new Swap();
    s.swap (10 , 20 );
    // System.out.println(a +" "+ b);
}    

void swap(int num1 , int num2){
    

    int temp = num1 ;
    num1 = num2 ;
    num2= temp ;

    System.out.println(num1 + " "+ num2 );
}

}
