package ifStatement;

import java.util.Scanner;

public class MyPractice2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter hour as: 0 -23 ");

        int hour = (int) sc.nextDouble();
        if (hour < 12 && hour >= 0) {
            System.out.println("good morning");
        }
        if (hour >= 12 && hour < 18) {
            System.out.println("good afternoon");
        }
        if  ( hour >= 18 && hour < 24){
            System.out.println("good night");

        }
    }
}
