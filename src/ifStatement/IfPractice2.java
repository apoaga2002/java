package ifStatement;

import java.util.Scanner;

public class IfPractice2 {
    public static void main(String[] args) {
        // good morning good afternoon
        // for the hours of morning
        // ask user to enter only hour for the time
        // if the hour is less than 12  print good morning
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter hour as : 1 - 24");
        int hour = (sc.nextInt());

        if (hour < 12){
            System.out.println("good morning");

            // number is not a condition

        }




    }
}
