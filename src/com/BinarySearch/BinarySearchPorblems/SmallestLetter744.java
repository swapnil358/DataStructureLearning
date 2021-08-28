package com.BinarySearch.BinarySearchPorblems;

//744-   https://leetcode.com/problems/find-smallest-letter-greater-than-target/
/*
Given a characters array letters that is sorted in non-decreasing order and a character target,
return the smallest character in the array that is larger than target.
*/

public class SmallestLetter744 {

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char ch = smallestNumber(letters, 'j');
        System.out.println(ch);

    }

    //Q - Ceiling of number ---> The Smallest element and equal to target (element <= target)
    public static char smallestNumber(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
           /* if (arr[mid] == target) {
                return mid;
            }*/

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }


}
