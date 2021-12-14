package switchstatement;

import java.util.Scanner;

public class SwitchPractice2 {
    public static void main(String[] args) {

        Scanner input = new  Scanner(System.in);
        System.out.println("what is your favorite? please enter name of it");
        String str = input.nextLine();
        switch (str) {
            case "mango":
                System.out.println("we have your favorite fruit in the store");
                break;

            
            case "banana":
                System.out.println();
        }
    }
}
