
package Class5;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter value for number  one");
        double math=scan.nextDouble();
        System.out.println("please enter value for number one");
        double math1=scan.nextDouble();
        System.out.println("please pick an operators!(+)(-)(*)(/)");
        char math2=scan.next().charAt(0);

        switch (math2){
            case '+':
                System.out.println(math+math1);
                break;
            case '-':
                System.out.println(math-math1);
                break;
            case '*':
                System.out.println(math*math1);
                break;
            case '/':
                System.out.println(math/math1);
            default:
                System.out.println("please enter valid operator");
        }
    }


    }


