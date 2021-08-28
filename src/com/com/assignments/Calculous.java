package com.com.assignments;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Scanner;

public class Calculous {

    public static void main(String[] args) {

        System.out.print("Enter operator: ");
        Scanner sc = new Scanner(System.in);
        char op = sc.next().trim().charAt(0);

        int result=0;

        if (op == '+' || op == '-' || op == '*' || op == '/' || op =='%') {

            System.out.print("Enter the first number: ");
            Scanner scan1 = new Scanner(System.in);
            int num1 = scan1.nextInt();

            System.out.print("Enter the second number: ");
            Scanner scan2 = new Scanner(System.in);
            int num2 = scan2.nextInt();


            if (op == '+'){
             result = num1+num2;
            }

            if (op == '-') {
                result=num1-num2;
            }
            if (op == '*') {
                result = num1 * num2;
            }
            if (op == '/') {
                if (num2 != 0) {
                    result = num1 / num2;
                }
            }
            if (op == '%') {
                result = num1%num2;
            }
        }else{
            System.err.println("Enter valid operator");
        }
        System.out.println("result: " +result);
    }

}


