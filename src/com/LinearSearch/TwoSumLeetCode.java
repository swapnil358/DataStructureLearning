package com.LinearSearch;

import java.util.Arrays;

public class TwoSumLeetCode {

    public static void main(String[] args) {

    int[] nums = {3,2,4};
    int target = 6;
        int[] i = twoSum(nums, target);
        System.out.println(Arrays.toString(i));
    }

    private static int[] twoSum(int[] nums, int target) {

        if (nums == null) {
            return new int[]{0, 0};
        }


        for (int i = 0; i <nums.length ; i++) {
            for (int j = i; j <nums.length-1; j++) {
                if (nums[i] + nums[j+1] == target){
                    return new int[]{i, j+1};
                }
            }

        }
        return nums;
    }
}

