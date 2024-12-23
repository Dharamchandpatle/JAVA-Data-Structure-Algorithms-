import java.util.Scanner;

public class NestesSwitch {
    public static void main(String aa[]){
        Scanner in = new Scanner(System.in);
        int empid = in.nextInt();
        String department = in.next();

        switch(empid){
            case 1 -> System.out.println("Dharamchand patle");
            case 2 -> System.out.println("Dharam's Code Mystery 7 ");
            case 3 -> System.out.println("Dharamchand patle 2");
            case 4 -> {
                System.out.println("Dharamchand patle 3 ");
                switch(department){
                    case "it" ->System.out.println("IT department");
                    case "CS " -> System.out.println("Computer science department ");
                    default -> System.out.println("Please enter valid department ");

                }

            }
            default -> System.out.println("Please enter valid empID ");
        }

    }
    
}
