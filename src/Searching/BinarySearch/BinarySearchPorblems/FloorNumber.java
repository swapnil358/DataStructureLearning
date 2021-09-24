package Searching.BinarySearch.BinarySearchPorblems;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int i = searchFloor(arr, 15);
        System.out.println(i);

    }

    //Q - Ceiling of number ---> The largest element and equal to target (element <= target)
    public static int searchFloor(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }


}
