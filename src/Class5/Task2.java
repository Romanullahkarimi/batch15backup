
package Class5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Which day do you want?");
        int day=scan.nextInt();
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("it's weekday");
            break;
            case 6:
            case 7:
                System.out.println("weekend day");
                break;
            default:
                System.out.println("invalid day");
        }
    }
}