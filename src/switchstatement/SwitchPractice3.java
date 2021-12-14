package switchstatement;

import java.util.Locale;
import java.util.Scanner;

public class SwitchPractice3 {
    public static void main(String[] args) {

        Scanner input = new  Scanner(System.in);

        System.out.println("which shape you want to calculate area of ? triangle/rectangle");

        String shape = input.nextLine().toLowerCase();
        switch (shape){
            case "triangle":
                System.out.println("please enter height of triangle");
                double h = input.nextDouble();
                System.out.println("the area of triangle is");
                break;

            case "rectangle":
                System.out.println("pease enter length of rectangle");
                double w = input.nextDouble();
                System.out.println("the area rectangle");
        }

    }
}
