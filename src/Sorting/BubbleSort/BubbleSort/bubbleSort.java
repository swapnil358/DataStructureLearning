package Sorting.BubbleSort.BubbleSort;

import java.util.Arrays;

//https://youtu.be/F5MZyqRp_IM?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ
//Time complexity O(n)
public class bubbleSort {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }


    static void bubble(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step, max item come at last index
            for (int j = 1; j < arr.length - i; j++) {
                //swap if the item is smaller than previous item
                if (arr[j] < arr[j - 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            //if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if (!swapped) {  //i.e !false = true
                break;
            }
        }

    }
}


