package Class8;

public class NestedLoops6 {
    public static void main(String[] args) {

        for(int i=0;i<3;i++){//excute the below code 3 times
            System.out.println(" ");
            for (int R=1;R<=10;R++){//prints the value of R from 1 t0 5

                System.out.print(R+" ");
                for (int j = 1; j <=20 ; j+=2) {
                    System.out.print(j+R+" ");

                }

            }

        }
    }

}