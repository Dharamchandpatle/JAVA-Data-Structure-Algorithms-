package Assignment;

import java.util.Scanner;

public class ElectricityBills {
    public static void main(String aa[])
{
    Scanner in = new Scanner (System.in);
    System.out.println(" Current Reading ");
    double currentReading = in.nextDouble();
    System.out.println(" previous Reading ");
    double PreviousReading = in.nextDouble();
    System.out.println("  taxeRate ");
    double taxeRate = in.nextDouble();
    System.out.println(" Rate Per Unit  ");
    double ratePerUnit  = in.nextDouble();
    System.out.println(" Fixed charge ");
    double fixedCharge = in.nextDouble();

    double unitConsumed = currentReading - PreviousReading ;
    double energyCost = unitConsumed * ratePerUnit ;
    double subTotal = energyCost + fixedCharge ;
    double taxes = (subTotal * taxeRate)/100;
    double totalBill = subTotal + taxes ;

    System.out.println(" Total Bill = "+ totalBill);



}
    
}
