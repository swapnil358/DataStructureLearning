package ArrryasAndArrayList;

import java.util.Arrays;

public class NoFixedCol {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 5, 9, 8},
                {5, 6},
                {7, 2, 6}
        };

        System.out.println(arr[0][1]);
        System.out.println(arr[1][1]);



        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(" ");
        }
    }
}
