package Searching.BinarySearch.BinarySearchPorblems;
//Amazon Interview Experience.
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
//https://youtu.be/W9QJ8HaRvJQ
public class infiniteArray {

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};

        int ans = ans(arr, 90);
        System.out.println(ans);
    }

    static int ans(int[] arr, int target) {
        //first find the range
        //first start with the box of size 2
        int start = 0;
        int end = start + 1;

        //condition for target to lie in the range
        while (start < end) {

            //this is the new start
            int temp = end + 1;
            //doubling the box size
            //end= previous end + size of the box
            end = (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target);
    }

    public static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

}
