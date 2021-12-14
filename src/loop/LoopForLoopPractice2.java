package loop;

public class LoopForLoopPractice2 {
    public static void main(String[] args) {

        for (int number = 5 ; number >=0   ; number--){
            System.out.println(number);

    // find the total of numbers between 1 to 5 by using loop ;
            int sum = 0;
            for ( int numbe = 1; number<5  ; number++){

                sum +=number;

                System.out.println("total >>"+sum);
                System.out.println("final total");
            }
        }
    }
}
