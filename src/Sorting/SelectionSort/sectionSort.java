package Sorting.SelectionSort;

import java.util.Arrays;

public class sectionSort {

    //worst Case complexity = O(n2)
    //Best Case Complexity = O(n2)
    //Stable = No
    //Use Case = It performs well on small lists/arrays

    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 2, 3,10};
        int maxElement = getMaxElement(arr, 3,5);
        System.out.println("max array is: " + maxElement);

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMaxElement(arr, 0, arr.length-i-1);
            swap(arr,maxIndex,lastIndex);
        }

    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    public static int getMaxElement(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
