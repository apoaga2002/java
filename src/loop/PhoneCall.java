package loop;

import java.util.Scanner;

public class PhoneCall {
    public static void main(String[] args) {
        int balance = 40;
        int calls =5;
        int count = 0;
        while ( balance>0){
            balance -=calls;
            count++;

            System.out.println("you can make "+count+calls+  balance);
            System.out.println(" balance");
        }

    }
}
