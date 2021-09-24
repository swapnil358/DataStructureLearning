package Searching.LinearSearch;

public class MinArray {
    public static void main(String[] args) {
        int[] arr = {12, 56, 89, 78, 45, 12, 4, 33,2};
        int minArray = minArray(arr,2,5);
        System.out.println(minArray);
    }

    private static int minArray(int[] arr, int start, int end) {

        int min = arr[0];
        if (arr == null) {
            return -1;
        }
            for (int i = start; i < end; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
        return min;
    }


    }
