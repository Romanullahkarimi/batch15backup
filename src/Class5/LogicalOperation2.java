package Class5;

public class LogicalOperation2 {
    public static void main(String[] args) {

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        double mathScore = 92.5;
        double historyScore = 91.5;
        double scienceScore = 93.5;
        /*
        if the score in all the subjects are greater than 90 print brilliant studnet
        otherwise print you need to work hard, if in one dubject less than 90 or more subjects we can't use logical
        operations we have to use ifEles condition
         */

        if (mathScore > 90 && historyScore > 90 && scienceScore > 90) {
            System.out.println(" you are brilliant student");

        } else {
            System.out.println("you need work hard");
        }


        if (mathScore > 90.0) {
            if (historyScore > 90) {
                if (scienceScore > 90) {
                    System.out.println("you are brilliant");

                } else {
                    System.out.println("you need to work hard in Science");
                }
            } else {
                System.out.println("you need to work hard with history");
            }
        } else {


            System.out.println("you need work hard with  science");
        }
    }
}




