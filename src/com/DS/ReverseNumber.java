package com.DS;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scan.nextInt();
        int r = 0;
        int sum = 0;


        while(num !=0){
            r = num % 10;
            sum = (sum * 10) + r;
            num /= 10;
        }
        System.out.println(sum);
    }
}
