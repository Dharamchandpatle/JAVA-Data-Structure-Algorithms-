import java.util.Scanner;

public class AreaOfTringle {
    public static void main(String aa[]){
        Scanner sc = new Scanner( System.in);
        System.out.print(" Enter your base : ");
        double base = sc.nextDouble();

        System.out.print("Enter your height : ");
        double height = sc.nextDouble();

        double area = (base * height )/2;

        System.out.print("Area of Tringle is : "+area);

    }
}
