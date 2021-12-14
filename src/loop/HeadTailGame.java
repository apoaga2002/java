package loop;

import java.util.Random;
import java.util.Scanner;

public class HeadTailGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String playagain;
        do {
            System.out.println("game is started, make a guess head/tail");
            String guess = scanner.nextLine();
            int number = random.nextInt(2);

            String result = number == 0 ? "head" : "tail";
            if (guess.equalsIgnoreCase(result)) {
                System.out.println("you are lucky");
            } else {
                System.out.println("sorry, that was not the correct choice");
            }
            System.out.println("do you want to play again? yes / no ");
            playagain = scanner.nextLine();


        } while (playagain.equalsIgnoreCase("yes"));



    }
}
