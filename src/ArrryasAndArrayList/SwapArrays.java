package ArrryasAndArrayList;

import java.util.Arrays;

public class SwapArrays {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Original array: "+ Arrays.toString(arr));

        swap(arr, 0, 4);
        System.out.println("Swapped Array: "+ Arrays.toString(arr));
        reverseArray(arr);



    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

    private static int reverseArray(int[] arr) {
         int start =0;
         int end = arr.length-1;

        if (start > end) {
            return -1;
        }

        while (start < end) {
            swap(arr,start, end);
            start++;
            end--;
        }
        System.out.println("Reverse array: "+Arrays.toString(arr));


        return start;
    }



}
