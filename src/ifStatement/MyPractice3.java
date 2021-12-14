package ifStatement;

import java.util.Scanner;

public class MyPractice3 {
    public static void main(String[] args) {
        // int minutes = 3456789;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the 7 digit number and we will revert it into year and days");
        int minutes = input.nextInt();
        int days = minutes / 60/24;
        System.out.println(days);
        int years = days % 365;
        System.out.println(years);
        int leftDays = days % 365;
        System.out.println(leftDays);
        System.out.println(minutes+ " minutes is "+ years + " years" + leftDays + days);
    }
}
