package com.DS;

import java.util.Scanner;

public class CountNumber {

        public static void main(String[] args) {

            Scanner scan  = new Scanner(System.in);
            System.out.print("Please enter the number: ");
            int num = scan.nextInt();
            int r =0;
            int count=0;
            while(num != 0 ){
                r = num%10;
                if (r == 5) {
                    count++;
                }
                num = num/10;
            }
            System.out.println("Number repeats for " +count+ " times");

        }
    }
