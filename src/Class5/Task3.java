
package Class5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("what was your test score ?");
        int score=scan.nextInt();
        if(score>=90){
            System.out.println("well done you got  grade A");
        } else if (score>=70&&score<90)
        {
            System.out.println("you got grade B");

        } else if (score>=50&&score<70)

        {
            System.out.println("you  got grade C");
        } else if (score<50) {
            System.out.println("you got chance ");

        }

        }

    }
