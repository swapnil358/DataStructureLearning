package Searching.LinearSearch;

import java.util.Arrays;

public class TwoDimArraysSearch {

    public static void main(String[] args) {

        int[][] arr = {
                {12, 56, 32, 2},
                {2, 65},
                {10, 20, 30},
                {45, 55, 66}

        };

        int[] search = searchIn2DArrays(arr, 99);
        System.out.println(Arrays.toString(search));


    }
    
    private static int[] searchIn2DArrays(int[][] arr, int target){

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] {row,col};
                }
             }
        }
        return new int[] {-1,-1};
    }
}
