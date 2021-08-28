package com.DS;

import java.util.Scanner;

public class CalculatorProgram {

    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
        //Take input till user does not press x or X
        int result = 0;
        while(true){
            System.out.print("Enter the operator: ");
            char op = scan.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op =='%') {
                //input two number

                System.out.print("Enter two number: ");
                int num1 = scan.nextInt();
                int num2 = scan.nextInt();

                if (op == '+') {
                    result = num1 + num2;
                }
                if (op == '-') {
                    result = num1 - num2;
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
                    result = num1 % num2;
                }
            } else if(op == 'x' || op == 'X'){
                break;
            } else{
                System.out.println("Invalid operator!!");
            }
            System.out.println("Answer is: "+result);
        }
    }

}
