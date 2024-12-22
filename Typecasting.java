import java.util.Scanner ;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int num = input.nextInt();
        // System.out.println(num);

        // float num2 = input.nextFloat();
        // System.out.println(num2);

        // Type casting 
        int num = (int)(8453.345f);
        System.out.println(num);

        // automatic type promotion 
        int a = 254;
        byte b = (byte)(a);
        System.out.println(b);

        int number = 'A';
        System.out.println(number);








    }

    
}
