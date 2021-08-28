package com.BinarySearch.BinarySearchPorblems;

//852. Peak Index in a Mountain Array - https://leetcode.com/problems/peak-index-in-a-mountain-array/
//162. Find Peak Element  - https://leetcode.com/problems/find-peak-element/

//https://youtu.be/W9QJ8HaRvJQ
public class MountainArray852 {

    public static void main(String[] args) {
        int[] arr = {3,4,5,1};
        int array = peakIndexInMountainArray(arr);
        System.out.println(array);
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
}
