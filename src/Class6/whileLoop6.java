package Class6;

public class whileLoop6 {
    public static void main(String[] args) {

        int number = 0;
        boolean condition = true;
        while (condition) {
            System.out.println("hello world");
            if (number > 3) {
                condition = false;
            }
        } number++;


        int number1 = 2;
        while (number < 10) {
            if (number % 2 == 0) {
                System.out.println("Even" + number);

            }
            number++;

            int number2 = 0;
            while (number <= 16) {
                if (number == 5 || number == 10 || number == 15) {

                } else {
                    System.out.println(number);
                }
                number++;


            }


        }
    }
    }
