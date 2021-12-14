package primitives;

import javax.print.DocFlavor;

public class UniricPractice {
    public static void main(String[] args) {

        int studentnumber = 25;
        System.out.println(studentnumber);
        studentnumber = studentnumber++;

        System.out.println(studentnumber);

        int count = 5;
        System.out.println(count++);
        System.out.println(++count);

        int num1 = studentnumber++;
        int num2 = studentnumber++;
        System.out.println(count++);


        System.out.println(count++);
        //====================
        int number =8;

        System.out.println(number--);


        int Count = 5;

        System.out.println(--number); // shows 5 is 5
        number++;
        System.out.println(number++ + number); // shows 13

        number++;
        System.out.println(number++ + number);
        System.out.println(number);
        int result = --number + --number + 2 - number++ * 2;
        System.out.println(result);
        System.out.println(number);

        int a = ++number;
        System.out.println(a);






    }
}
