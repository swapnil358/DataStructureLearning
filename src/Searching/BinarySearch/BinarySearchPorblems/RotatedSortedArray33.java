package Searching.BinarySearch.BinarySearchPorblems;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
//https://youtu.be/W9QJ8HaRvJQ?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ
public class RotatedSortedArray33 {


    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,0,1,2};
        int pivot = findPivot(arr);
        System.out.println("pivot is: "+ pivot);
        int i = search(arr, 0);
        System.out.println(i);

    }

    public static int search(int[] arr, int target) {
        int pivot = findPivot(arr);

        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(arr, target, 0 , arr.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (arr[pivot] == target) {
            return pivot;
        }

        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }

        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }




    static int findPivot(int[] arr) {
    /*
    Cases for finding the pivot

    1. if mid>mid+1 ---> mid is pivot
    2. if mid>mid-1 ----> mid-1 is pivot
    3. start<mid  //i.e means bigger numbers lies in second part after the mid
    ---> start = mid+1
    4. start>mid  //i.e means bigger numbers lies in first part after the mid
    In this case, all elements from mid, will be less than start.Hence, we can ignore all these
    elements' sine we are looking for peak i.e the largest element . --> end = end-1

    */
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;

    }

    public static int binarySearch(int[] arr, int target, int start, int end) {

        start = 0;
        end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
