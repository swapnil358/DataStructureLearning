package ArrryasAndArrayList;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
//@ Given an array nums of integers, return how many of them contain an even number of digits.
public class EvenDigitLeetCode {
    public static void main(String[] args) {
        int[] nums = {555, 901, 482, 1771,1234};
        int numbers = findNumbers(nums);
        System.out.println(numbers);

        int b = evenNumber(-654564);
        System.out.println(b);
    }

    private static int findNumbers(int[] nums) {
        int count = 0;

        for (int num: nums){
            if (digits(num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean digits(int n) {
        int i = evenNumber(n);
        return i % 2 == 0;
    }


    private static int evenNumber(int num) {

        int count = 0;
        int even = 0;

        if (num == 0) {
            return 1;
        }

        while (num !=0) {
            count++;
            num = num/10;
        }
        return count;

    }
}
