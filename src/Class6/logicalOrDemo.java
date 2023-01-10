package Class6;

import java.util.Scanner;

public class logicalOrDemo {
    public static void main(String[] args) {

        System.out.println("please enter your day");

        Scanner scan=new Scanner(System.in);

        String day=scan.next();

        if (day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("friday")) {
            System.out.println("no calss today");
        } else if (day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")){
            System.out.println("java class enjoy");

        } else if (day.equalsIgnoreCase("wednsday")||day.equalsIgnoreCase("tuesday")) {
            System.out.println("testing calss");

            } else if (day.equalsIgnoreCase("thursday")) {
            System.out.println("review class");

        }else {
            System.out.println("wrong day entered");

    }  {

        }

    }
    }

