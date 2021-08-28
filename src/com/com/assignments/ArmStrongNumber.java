package com.com.assignments;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
      /*  Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();

        boolean b = armstrongNum(num);
        System.out.println(b);*/
        /*

        */
        for (int i = 100; i < 1000; i++) {
            if (armstrongNum(i)) {
                System.out.print(i+ ", ");
            }
        }


    }

    private static boolean armstrongNum(int num) {

        int reminder = 0;
        int sum = 0;
        int original = num;

        while (num>0) {

            reminder = num % 10;
            sum = sum + reminder * reminder * reminder;
            num = num / 10;

        }
        return sum == original;


    }
}
