package com.com.assignments;

import java.util.Scanner;

public class isPrime {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int n = scan.nextInt();
        boolean b = isPrimeNumber(n);
        System.out.println(b);
    }

    static boolean isPrimeNumber(int n) {
        if (n <= 1) {
            return false;
        }

        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
