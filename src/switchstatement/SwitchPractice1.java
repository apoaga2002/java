package switchstatement;

import java.util.Scanner;

public class SwitchPractice1 {
    public static void main(String[] args) {

        int number = 4;
        switch  (number){
            case 1:
                System.out.println("summer");
                break;
            case 2:
                System.out.println("spring");
                break;
            case 3:
                System.out.println("winter");
                break;
            case 4:
                System.out.println("fall");
                break;
            default:
                System.out.println("wrong number");
                break;
        }
    }
}
