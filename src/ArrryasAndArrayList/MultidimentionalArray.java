package ArrryasAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimentionalArray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();

            }

        }

//Output -- printing array
        System.out.println("Printing array using for loop");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println(" ");
        }

        System.out.println("Printing array by toString()");
        //Printing array by toString()
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        //Printing array using enhance for loop
        System.out.println("Printing array using enhance for loop");

        for (int [] a: arr) {
            System.out.println(Arrays.toString(a));
        }





    }
}
