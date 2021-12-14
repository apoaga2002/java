package loop;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number between 3 to 10");
        int number = scanner.nextInt();
        int x = 0;
        String str = "*";
        do {
            System.out.println(str);
            str += "*";
            x++;
        } while (x < number);
        }

        }


