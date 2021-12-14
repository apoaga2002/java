package loop;

import switchstatement.SwitchPractice;

public class MonthsOfYear {
    public static void main(String[] args) {


        for (int year=2020;year <=2023; year++){
            System.out.println(year);
            for (int month =1; month<=12; month++){
                System.out.println(month+"-");

                switch (month){
                    case 1:
                        System.out.println("jan");
                        for (int m=1; m<=31; m++){
                            System.out.println(m +" ");
                        }
                        break;
                    case 2:
                        System.out.println("feb");
                        break;
                    case 3:
                    System.out.println("march");

                    break;
                    case 4:
                        System.out.println("april");
                        break;
                    case 5:
                        System.out.println("may");
                        break;
                    case 6:
                        System.out.println("june");
                        break;
                    case 7:
                        System.out.println("july");
                        break;
                    case 8:
                        System.out.println("august");
                        break;
                    case 9:
                        System.out.println("september");
                        break;
                    case 10:
                        System.out.println("october");
                        break;
                    case 11:
                        System.out.println("november");
                        break;
                    case 12:
                        System.out.println("december");

                }

            }

                }
            }
        }


