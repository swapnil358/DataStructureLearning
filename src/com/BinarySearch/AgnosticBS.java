package com.BinarySearch;

//in this question, we need to check if the given array is sorted ascending or descending

public class AgnosticBS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};


        int i = angosticBS(arr, 6);
        System.out.println(i);

    }

    public static int angosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;


        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

