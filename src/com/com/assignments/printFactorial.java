package com.com.assignments;

//Write a program to print factorial of a number, also take input

import java.util.Scanner;

public class printFactorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int num = scan.nextInt();
        int a =0;
        int b = 1;
        int count=2;

        while (count<=num){
            int temp = b;
            b = b+a;
            a =temp;
            count++;
        }
        System.out.println(b);
    }
}
