import java.util.Scanner;

public class AreaOfCircle {
    public static void main (String aa []){
        Scanner in = new Scanner (System.in);
        System.out.print(" Please enter the radius of the circle : ");
        double r = in.nextDouble();

        double area = Math.PI *r*r;
        System.out.println(" The area of the circle is : "+ area);

    }
}
