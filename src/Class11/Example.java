package Class11;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {

        int[][] matrix={{10,20,30},
                        {45,55,60},
                        {30,40,59,60,78},

        };
       //write a loop to print all the element from 2D array
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();

        }

    }
}
