package ifStatement;

import java.util.Scanner;

public class NestedPractice1 {
    public static void main(String[] args) {
        System.out.println("which city you live in?");
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        if (city.equalsIgnoreCase( "chicago")) {
            System.out.println("which course are you attending?");
            String course = scanner.nextLine();

            if (course.equalsIgnoreCase("TechTorial")) {
                System.out.println("which bach are you in?");
                String batch = scanner.nextLine();

                if (batch.equalsIgnoreCase("11")) {
                    System.out.println("it is getting easier!!!");
                } else {
                    System.out.println("Congrats you already done !");
                }
            } else {
                System.out.println("we arte at the Des plains, please visit us");
            }
            }else{
            System.out.println("please come to chicago you will like it in summer");




                }
            }
        }






