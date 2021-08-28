package com.LeetCode;


//  1672  -  https://leetcode.com/problems/richest-customer-wealth/
/*

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6

*/

import java.awt.image.BandedSampleModel;
import java.util.Arrays;

public class RichestCustomerWealth {

    public static void main(String[] args) {
        int[][] accounts = {
                {1,5},
                {3,2,4},
                {4,3}
        };

        int i = maximumWealth(accounts);
        System.out.println(i);

    }


    public static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;

        for (int person = 0; person <accounts.length ; person++) {
            int sum = 0;
            for (int account = 0; account <accounts[person].length; account++) {
                sum += accounts[person][account];
            }
                if (sum>ans) {
                    ans = sum;
                }
        }
        return ans;
    }
}