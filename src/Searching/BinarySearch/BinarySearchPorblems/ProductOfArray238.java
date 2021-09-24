package Searching.BinarySearch.BinarySearchPorblems;

import java.util.Arrays;

public class ProductOfArray238 {

    public static void main(String[] args) {

        int[] nums = {-1,1,0,-3,3};
        int[] ints = productExceptSelf(nums);
        System.out.println(Arrays.toString(ints));

    }

    public static int[] productExceptSelf(int[] nums) {

        int[] solution = new int[nums.length];

        int temp = 1;

        for (int num : nums) {
            temp = temp * num;
        }

        for (int j = 0; j < nums.length; j++) {
           solution[j] = temp / nums[j];
        }

        return solution;
    }

}
