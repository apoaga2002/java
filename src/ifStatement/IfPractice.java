package ifStatement;

public class IfPractice {
    public static void main(String[] args) {
        int appleNumber = 5;
        int orangeNumber = 10;
        // ==,>,<, !=,>=
        System.out.println("I am about to create an IF block");
        if (appleNumber == orangeNumber) {
            System.out.println("I am lucky today");
        }
        if (appleNumber != orangeNumber) {
            System.out.println("I am so HAPPY today");
        }
        if (appleNumber <= orangeNumber) {
            int sum = appleNumber + orangeNumber;
            System.out.println("you have " + sum + " fruits");
        }
        System.out.println("so far so good");

        if (orangeNumber < appleNumber) {

            System.out.println(orangeNumber * appleNumber + "is in the condation");

        }


    }
}
