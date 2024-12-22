import java.util.Scanner;

public class Temprature {
    public static void main(String aa[]){
        Scanner in = new Scanner(System.in);
        System.out.println(" Please enter temp in c = ");
        float c = in.nextFloat();
        float f = (c * 9/5)+ 32;
        System.out.println("Temp of F is : "+ f);

    }
}
