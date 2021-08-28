package com.LeetCode;

import java.util.Arrays;

//https://leetcode.com/problems/two-sum/

public class TwoSumLeetCode {

    public static void main(String[] args) {

    int[] nums = {2,9,11,15,66,77,88,99,12,34,56,78,90};
    int target = 0;
        int[] i = twoSum(nums, target);
        System.out.println(Arrays.toString(i));
    }

    private static int[] twoSum(int[] nums, int target) {

        if (nums == null) {
            return new int[]{0, 0};
        }
        if (target >= 0 ) {
            return new int[]{0,0};
        }


        for (int i = 0; i <nums.length ; i++) {
            for (int j = i; j <nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }

        }
        return nums;
    }
}

