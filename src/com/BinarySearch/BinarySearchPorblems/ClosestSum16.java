package com.BinarySearch.BinarySearchPorblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/3sum-closest/
public class ClosestSum16 {

    public static void main(String[] args) {
        int[] nums = {0,1,2};
        int i = threeSumClosest(nums, 1);
        System.out.println(i);
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0]+nums[1]+nums[nums.length-1];
        for (int i = 0; i < nums.length-2; i++) {
            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {
                int currentSum = nums[i] + nums[start] + nums[end];
                if (currentSum<target) {
                    start++;
                } else if (currentSum>target) {
                    end--;
                }
                if(Math.abs(closestSum-target)>Math.abs(currentSum-target)){
                    closestSum=currentSum;
                }

            }
        }
        return closestSum;
    }




}
