package loop;

public class DoWhilePractice2 {
    public static void main(String[] args) {

        int a = 1;
        int b =3;
        int sum = 0;
        do {
            sum += a;
            a++;
        } while (a <= b) ;
            System.out.println("sum is " + sum);

        }

    }

