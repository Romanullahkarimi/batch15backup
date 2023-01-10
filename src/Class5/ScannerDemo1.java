package Class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        /*
        system.out => tell the computer we want to read the data from computer

         scan is just like variables like primitive variables
         */


        System.out.println("please enter your age");
        int age=scan.nextInt();
        System.out.println("you are "+age+" years old");

        System.out.println("please enter your weight ");
        double wieght=scan.nextDouble();
        System.out.println("your are "+wieght+"kgs");
        System.out.println("are you hungry");
        boolean hungry=scan.nextBoolean();
        System.out.println("hungry "+hungry);





        System.out.println("please enter your Gender");
        char gender=scan.next().charAt(0);
        System.out.println("your gender is "+gender);

        System.out.println("please enter your name");
        String name=scan.next();
        System.out.println("your name is "+name);

        System.out.println("please enter your full name");
         String name1=scan.next();
        System.out.println("your full name is "+name1);

        scan.close();// Good practice, when you are done with coding it save CPU to process fast





    }
}
