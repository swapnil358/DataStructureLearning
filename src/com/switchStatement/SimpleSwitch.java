package com.switchStatement;

import java.util.Scanner;

public class SimpleSwitch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the fruit name : ");
        String fruit = scan.next();

        switch (fruit){
            case "Mango":
                System.out.println("king of fruit");
                break;
            case "Orange":
                System.out.println("round fruit");
                break;
            case "Grapes":
                System.out.println("small fruit");
                break;
            case "Banana":
                System.out.println("long fruit");
                break;
            default:
                System.out.println("Please enter the valid fruit");
        }

    }





}
