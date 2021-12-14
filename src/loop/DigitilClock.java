package loop;

import java.util.concurrent.LinkedTransferQueue;

public class DigitilClock {
    public static void main(String[] args) {

        // print hour and minutes for 12 hours of a day
        // ex 00 ...
             label:
        for(int hour=0 ; hour<12 ; hour++){
            for (int min=0;min<=59;min++){
             if (min >=10 && min <=12){
                 continue ;
             }
                if (min>=30){
                    break label;
                }

                for (int sec =0; sec<= 59;sec++){

                    System.out.println(+hour+":"+ min+":"+sec);
                }
            }

        }
    }
}
