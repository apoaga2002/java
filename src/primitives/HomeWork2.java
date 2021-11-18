package primitives;

public class HomeWork2 {
    public static void main(String[] args) {

        //===================================================
        //TASK 5
        int min = 3456789;
        int hr =60 ;
        int hrs = min / hr;
        int day = 24;
        int days = hrs / day;
        System.out.println(days);

        int year = 365;
        int years = days / year;
        int tday = days % year;
        System.out.println("The total is approximately " +years + " years and "  +tday + " days");
        //===================================
        // Task4
        double inch = 2000;
        double inchTometer = 0.0254;
        double meters = inch * inchTometer;
        System.out.println(meters);
        //===========================================
       // Task3
        int doll$ =1;
        double turkishLira =doll$ *11.20;
        System.out.println(turkishLira);


    }
}
