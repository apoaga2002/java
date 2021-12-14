package ifStatement;

import java.util.Scanner;

public class MyPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner((System.in));
        System.out.println("please enter a word");

        String word = input.nextLine();
        if (word.startsWith("m"));{

            System.out.println("monday");
        }
        if (word.startsWith("t")){
            System.out.println("Tuesday / thursday");
        }
        if (word.startsWith("w")){
            System.out.println("wednesday");
        }
        if (word.startsWith("f")){
            System.out.println("Friday");
        }
        if (word.charAt(0)=='$'){
            System.out.println("saturday/sunday");
        }


    }
}
