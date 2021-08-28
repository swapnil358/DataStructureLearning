package ArrryasAndArrayList;

import java.util.Arrays;

public class reverse {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArr(arr);
        System.out.println("Reverse array is: "+Arrays.toString(arr));
    }

    private static void reverseArr(int[] arr) {
        int start =0;
        int end = arr.length-1;

        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
