package com.BinarySearch.BinarySearchPorblems;

//1095. Find in Mountain Array - https://leetcode.com/problems/find-in-mountain-array/
//https://youtu.be/W9QJ8HaRvJQ

//this question is can be easily solved by help of mountain peak and Binary search


/*
Algorithm
suppose  array is => [1,2,3,4,5,3,1]
1. find the  peak element => 4
2. Binary search in asc arrays => (0,4)
3. if not found , binary search in desc array
 */


import com.BinarySearch.AgnosticBS;

import java.lang.reflect.GenericDeclaration;

public class FindInMountainArray1095 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int array = findInMountainArray(arr, 3);
        System.out.println(array);

    }
    public static int findInMountainArray(int[] arr, int target) {

        int peakArray = peakIndexInMountainArray(arr);
        int firstTry = angosticBS(arr, target, 0, peakArray);
        if (firstTry != 0) {
            return firstTry;
        }
        return angosticBS(arr, target, peakArray + 1, arr.length - 1);

    }



    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        return start; //or end, because both point to the same element
    }

    public static int angosticBS(int[] arr, int target, int start, int end) {

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

