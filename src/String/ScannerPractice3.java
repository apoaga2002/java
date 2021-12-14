package String;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        // use scanner to
        // get name and DOB your of user
        // calculate user 's age
        // print = currant - DOB
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your name ");
        String name =scanner.nextLine();
        System.out.println("please enter your birth year");
        int  birthYear = scanner.nextInt();
        int age = 2021 - birthYear;
        System.out.println(name +"you are "+age+"years old");
        int currantYear = LocalDate.now().getYear();
        System.out.println(currantYear);
        int currentMinute = LocalDateTime.now().getMinute();
        System.out.println(currentMinute);
    }
}
