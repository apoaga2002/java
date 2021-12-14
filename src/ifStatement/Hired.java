package ifStatement;

import java.util.Scanner;

public class Hired {
    public static void main(String[] args) {

        // she/ he / knows java yes /no / yes ask  who knows selenium.

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome, Do you know Java? yes / no");
        String java = input.nextLine();
        if (java.equalsIgnoreCase("yes")){
            System.out.println("Do you have Selenium Experience? yes / no / learn");
            String selenium= input.nextLine();
            if (selenium.equalsIgnoreCase("yes") || selenium.equalsIgnoreCase("learn")){
                System.out.println("do you have API testing experience");
                String api = input.nextLine();
                if (api.equalsIgnoreCase("yes")){
                    System.out.println("Do you have Sql knowledge? yes/ no");
                    String sql = input.nextLine();
                    if (sql.equalsIgnoreCase("yes")){
                        System.out.println("Congrats!! HIRED!!!");
                    }else{
                        // sql  response
                        System.out.println("We need someone with sql knowledge");
                    }
                }else{
                    // api response
                    System.out.println("We need someone with API knowledge");
                }
            }else{
                // thi is for selenium question
                System.out.println("We need someone with Selenium knowledge");
            }
        }else {
            // this is for java answer
            System.out.println("You should learn at least one programming language");
        }


    }
}
