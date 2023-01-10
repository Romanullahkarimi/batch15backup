
package Class5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your birth month ?");
        String birth=scan.next();
        switch (birth){
            case "March":
            case "April":
            case "may":
                System.out.println("you were born in Spring");
         break;
            case "June":
            case "July":
            case "August":
                System.out.println("You were born in Winter");
                break;
            case "September":
            case "October":
            case "november":
                System.out.println("you were born in Autumn");
                break;
            case "December":
            case "January":
            case "February":
                System.out.println("you were born in Summer");
            default:
                System.out.println("Please enter Valid month");
        }



        }

    }
