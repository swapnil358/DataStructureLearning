package com.com.assignments;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter principle amount: ");
        int p = scan.nextInt();
        System.out.print("Enter rate of annum: ");
        double r = scan.nextDouble();

        System.out.print("Enter time duration: ");
        int t = scan.nextInt();

        int simpleInterest = (int) ((p*r*t)/100);

        System.out.println("Simple interest is : "+simpleInterest);
    }
}
