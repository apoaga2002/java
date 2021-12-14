package loop;

import java.util.Locale;
import java.util.Scanner;

public class CountingChar {
    public static void main(String[] args) {

        String str = "$3%GT1k64mn^y?".toUpperCase();
        int index=0;
        int letterCounter=0, digitCounter=0,charCounter=0;
        do {
            if (str.charAt(index) >= 'A' && str.charAt(index) <= 'z') {
                letterCounter++;
            } else if (str.charAt(index) >= '0' && str.charAt(index) >= '9') {
                digitCounter++;
            } else {
                charCounter++;
            }
            index++;
        }while (index < str.length());
        System.out.println(" there are "+letterCounter+" letters in the string");
        System.out.println("there are "+digitCounter+"numbers in the string");
        System.out.println("there are "+charCounter+" symbols in the string");
            }
        }



