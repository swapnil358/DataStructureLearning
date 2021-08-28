package com.BinarySearch.BinarySearchPorblems;

import java.util.Arrays;

//Check for pair in an array with a given sum - Interview Problem

public class TwoSum1 {

    public static void main(String[] args) {
        int[] arr = {-5, 1, -40, 20, 6, 8, 7};
        int[] value = getValue(arr, 15);
        System.out.println(Arrays.toString(value));
        System.out.println(Arrays.toString(arr));

    }

    static int[] getValue(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            Arrays.sort(arr);
            if (arr[start] + arr[end] == target) {
                return new int[]{start,end};
            }else if(arr[start] + arr[end] > target){
                end--;
            }else{
                start++;
            }
        }
        return new int[]{-1, -1};
    }

}
