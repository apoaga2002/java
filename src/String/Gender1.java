package String;

import java.util.Scanner;

public class Gender1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please provide your gender ,full name ");

        String info = input.nextLine();
        System.out.println(info.startsWith("f"));
        System.out.println(info.endsWith("m"));
        System.out.println(info.endsWith("efe"));
        System.out.println(info.endsWith("2000"));

    }
}
