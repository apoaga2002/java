package loop;

public class PerfectNumber {
    public static void main(String[] args) {

        // perfect number
        // if sum of the divisors  except number itself equal to number , it is called perfect number ex 28
         int number =28;
         int sum = 0;
        for (int divisor =1; divisor <= number/2; divisor++){
            if (number % divisor ==0){
                sum += divisor;

                if (number == sum){
                    System.out.println("is a perfect number ");
                }else {
                    System.out.println("is not a perfect number");
                }

            }
        }
    }
}
