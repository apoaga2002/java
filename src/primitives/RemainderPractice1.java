package primitives;

public class RemainderPractice1 {
    public static void main(String[] args) {
        // moduleus --> remainder ( left over division)
        int number1 = 45;
        int number2 = 6 ;

        int remainder1 = number1 % number2;
        System.out.println(remainder1  >> + remainder1);

        // Find the sum of digits 123 % 10 >>> 3
        // 12  % 10 >> 2
        // 123 % 10 >>> 3
        int mynumber = 123;
          int  digit3 = mynumber % 10;
          mynumber = mynumber /10;
          int digit2 = mynumber % 10;
          mynumber =  mynumber % 10;
        System.out.println(digit3);
        System.out.println(digit2);
        System.out.println(digit2);
      // find the product of digit from givien number
        //456 ==> 4 * 5 * = 128

        int num = 456;
        int d1 = num %10;
        num = num / 10;
        int d2 = num % 10 ;
        num = num % 10;
        int d3 = num /10;
        int product = d1 *d2*d3;
        System.out.println("the product is");






    }
}

