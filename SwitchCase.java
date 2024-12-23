import java.util.Scanner;

public class SwitchCase {
    public static void main(String aa[]) {
        Scanner in = new Scanner(System.in);
        // String fruit = in.next();

        // switch (fruit) {
            // case "mango":
            // System.out.println(" King of fruits ");
            // break;

            // case "orange":
            // System.out.println("Orange is a sweet fruit ");
            // break ;

            // case "graps":
            // System.out.println(" Small fruits ");
            // break;

            // default:
            // System.out.println(" PLease enter a valid fruit name");

            // THis is a new pattern of switch statement

            // case "mango" -> System.out.println("king of fruits ");
            // case "orange" -> System.out.println("king of fruits ");
            // case "guava" -> System.out.println("king of fruits ");
            // case "graps" -> System.out.println("king of fruits ");



        // }

        int i = in.nextInt();
        switch(i){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("wedday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Thursday");
            case 7 -> System.out.println("Sunday");
        }
    }

}
