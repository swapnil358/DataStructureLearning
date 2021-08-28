package com.BinarySearch.BinarySearchPorblems;


//154. Find Minimum in Rotated Sorted Array II
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
//https://youtu.be/W9QJ8HaRvJQ?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ

public class RotationCount154 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int i = countRotation(arr);
        System.out.println("Rotation count is: "+i);
    }

    public static int countRotation(int[] arr) {
        int pivot = findPivot(arr);

        return pivot + 1;
    }

    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] <=arr[mid]) {
                end = mid - 1;
            } else {
                start = start + 1;
            }
            }
        return -1;
        }
    }

