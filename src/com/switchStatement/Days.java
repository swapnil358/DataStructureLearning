package com.switchStatement;

import java.util.Scanner;

public class Days {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter days number: ");
        int day = scan.nextInt();

        switch (day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.err.println("Enter correct day, between 1 to 7");
        }

    }


}
