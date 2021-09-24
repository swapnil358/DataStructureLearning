package Sorting.InsertionSort;

import java.util.Arrays;

public class insertionSort {


    /*
    Worst case: O(n2)
    Best Case : Arrays is already sorted = > O(n)

    Why use it?
    1. Adaptive - Steps get reduces if array is sorted.
                    number of swap reduced as compare to bubble sort
    2. Stable
    3. Used for smaller value of N => works good which array is partially sorted --> it takes part in
            hybrid sorting algorithm
     */


    public static void main(String[] args) {

        int[] arr = {5,3,4,1,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertion(int[] arr){
        for (int i = 0; i <=arr.length-2; i++) {
            for (int j = i+1; j >0; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
