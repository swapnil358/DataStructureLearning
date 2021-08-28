package com.com.assignments;

//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {

        getMethod1();
        getMethod2();

    }

    private static void getMethod2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scan.nextInt();


        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter second number: ");
        int b = scan1.nextInt();

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Enter third number: ");
        int c = scan1.nextInt();

        int max;

        max =a;

        if (max > b && max > c) {
            System.out.println(max);
        }

    }

    private static void getMethod1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scan.nextInt();


        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter second number: ");
        int b = scan1.nextInt();

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Enter third number: ");
        int c = scan1.nextInt();

        if (a > b && a > c) {
            System.out.println("greater: " + a);
        }
        if (b > a && b > c) {
            System.out.println("greater: " + b);
        }
        if (c > a && c > b) {
            System.out.println("greater: " + c);
        }
    }

}
