package com.LeetCode;

//https://leetcode.com/problems/reverse-integer/
//Reverse integer

public class ReverseInteger {
    /*
    Test cases
    123=>321
    -123=>-321
    120=>0
    0=>0
    +-2147483648=>0     -->32 bit number

     */


    public static void main(String[] args) {
        int num = -1000000045;
        int reverse = (int) reverse(num);
        System.out.println(reverse);
        //System.out.println(Integer.MAX_VALUE);
       // System.out.println(Integer.MIN_VALUE);
    }

    public static int reverse(int num){
        int r = 0;
        long sum = 0;

        while (num!=0) {
            r =  num % 10;
            sum = (sum * 10) + r;
            if (sum > Integer.MAX_VALUE){
                return 0;
            } else if (sum < Integer.MIN_VALUE) {
                return 0;
            }
            num = num/10;
        }
        return (int) sum;
    }

}
