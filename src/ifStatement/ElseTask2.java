package ifStatement;

import java.util.Scanner;

public class ElseTask2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your zipcode");
        int zip = sc.nextInt();
        if (zip % 2 == 0) {
            System.out.println("your zipcode is even number");
        }else{
            System.out.println("your zipcode is odd number");
        }
    }
}
