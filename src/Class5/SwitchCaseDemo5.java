
package Class5;

import java.util.Scanner;

public class SwitchCaseDemo5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("what is your gender ?");
        char gender=scan.next().charAt(0);

        char gendar= 'F';
        switch (gendar){
            case 'F':
                System.out.println("Female");
                break;
            case 'M':
                System.out.println("Male");
                break;
            default:
                System.out.println("not sepecified");
        }




    }}