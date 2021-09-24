package Searching.BinarySearch.BinarySearchPorblems;

public class BinarySrchAsc {

    public static void main(String[] args) {
        int[] arr = {-12, -1,0,3,5,9,12};
        int i = binarySearch(arr, 12, 0, 6);
        System.out.println(i);
    }

        public static int binarySearch(int[] arr, int target, int start, int end){

         start = 0;
         end = arr.length - 1;

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
