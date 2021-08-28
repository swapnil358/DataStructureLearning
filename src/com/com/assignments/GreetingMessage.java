package com.com.assignments;

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = scan.next();

        if (name.equalsIgnoreCase("swapnil")){
            System.out.println("Good Morning Swapnil");
        }else{
            System.err.println("Invalid name entered");
        }

    }
}
