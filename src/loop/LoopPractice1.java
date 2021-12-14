package loop;

import java.util.Scanner;

public class LoopPractice1 {
    public static void main(String[] args) {

        int age = 21;
        while (age <= 26) {
            System.out.println("my age is :" + 26);
            age++;

            int number = 10;

            System.out.println("my nuber is 10 and 20");
            while (number <= 21) {
                System.out.println(number);
                number++;

                //

                Scanner numUser = new Scanner(System.in);
                System.out.println("Please enter an integer number");
                int inputNumber = numUser.nextInt();
                int divisor = 20;
                while (divisor <= inputNumber) {
                    if (inputNumber % divisor == 0) {

                        System.out.println(" is divisor of " + numUser);
                        divisor++;
                        //////////////////////////////////////////////////////////////

                        Scanner scanner = new Scanner(System.in);

                        System.out.println("please enter a string value");
                        String str =  scanner.nextLine();

                        System.out.println(str.charAt(2));
                        int i=0;
                        while (i< str.length()){
                            System.out.println(str.charAt(i)+",");
                            i++;
                        }
                        //

                        }




                    }
                }

            }
        }
    }
