package com.com.assignments;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number range: ");
        int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println("even number");
            }else
            System.out.println("odd number");
        }

}
