package String;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {


        String name = "david";
        System.out.println("my name is "+name);
        Scanner input = new Scanner(System.in);
        String lastName = input.nextLine();
        System.out.println(lastName);
        System.out.println(" please answer my question ");

        // Task Ask user to enter his /her name and
        // print as: "<name><lastName>you are Living in <city>"

        System.out.println("please enter your city name");
        String city = input.nextLine();
        System.out.println( name+ " "+lastName+"you are living in"+city);
        System.out.println("please enter your age");

        int age = input.nextInt();
        System.out.println(name + " your is very good age. that is >> ");

        System.out.println("please enter your height in feet and inches(i.e)");
        double height = input.nextDouble();
        System.out.println("your height is "+height);

        System.out.println("please enter your address");
        String address = input.nextLine();
        System.out.println("Is correct you provide");






    }
}
