package switchstatement;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {

        /*
        1- IT dept
            David, Time
        2- Admin
            Alex, Jessi
        3- Customer Care
            Zack, Ana, John
            "Who do you want to speak with? Please enter name: David, Time"
         */
                Scanner scanner = new Scanner(System.in);
                System.out.println("Welcome to Techtorial! Which department do you want to connect? please select from following options" +
                        "\n1- IT Department\n2- Admin\n3- Customer Care");
                int dept = scanner.nextInt();
                switch (dept) {
                    case 1:
                        System.out.println("You are in IT Dept, Who do you want to speak with? Please enter name: David, Tima");
                        scanner = new Scanner(System.in);
                        String name = scanner.nextLine().toLowerCase();
                        switch (name) {
                            case "david":
                                System.out.println("Hello This is David");
                                break;
                            case "tima":
                                System.out.println("Hello This is Tima");
                                break;
                            default:
                                System.out.println("We don't have " + name);
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("You are in Admin Dept, Who do you want to speak with? Please enter name: Alex, Jessi");
                        scanner = new Scanner(System.in);
                        String name1 = scanner.nextLine().toLowerCase();
                        switch (name1) {
                            case "alex":
                                System.out.println("Hello This is Alex");
                                break;
                            case "jessi":
                                System.out.println("Hello This is Jessi");
                                break;
                            default:
                                System.out.println("We don't have " + name1);

                        }
                        break;
                    case 3:
                        System.out.println("You are in Customer Care, Who do you want to speak with? Please enter name: Zack, Ana, John");
                        scanner = new Scanner(System.in);
                        String name2 = scanner.nextLine().toLowerCase();
                        switch (name2) {
                            case "zack":
                                System.out.println("Hello This is Zack");
                                break;
                            case "ana":
                                System.out.println("Hello This is Ana");
                                break;
                            case "john":
                                System.out.println("Hello This is John");
                                break;
                            default:
                                System.out.println("We don't have " + name2);
                                break;
                        }
                        break;
                    default:
                        System.out.println("Your selection is not valid for department Number");
                        break;
                }
            }
        }

