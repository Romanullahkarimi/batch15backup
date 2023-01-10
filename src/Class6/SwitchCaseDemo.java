package Class6;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("what is your favorite food in the world ?");
        String country=scanner.next();

        switch (country.toLowerCase()){
            case "usa":
                System.out.println("burger");
                break;
            case "itlay":
                System.out.println("pasta");
                break;
            case "afghanistan":
                System.out.println("Kabab");
                break;
            default:
                System.out.println("wrong country");


        }

    }
    }

