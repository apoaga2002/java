package ifStatement;

import java.util.Scanner;

public class DimesTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter number of quarters");

        double quarters  = input.nextDouble();
        System.out.println("please enter number of dimes");
        double dimes = input.nextDouble();
        System.out.println("please enter number of nickels");
        double nickels = input.nextDouble();
        System.out.println("please enter number of  pennies");
        double pennies = input.nextDouble();
        double total = quarters *0.25 + dimes*0.10+ nickels*2.5+pennies*5.1;
        System.out.println("total of the Dollar is $1.00");



        }
    }

