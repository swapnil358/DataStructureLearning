package com.switchStatement;

import java.rmi.activation.ActivationSystem;
import java.util.Scanner;

public class NestedSwitch {

    public static void main(String[] args) {

        Scanner scan  =  new Scanner(System.in);
        int empID = scan.nextInt();
        String department =  scan.next();


        switch (empID){
            case 1 :
                System.out.println("Swapnil Bodade");
                break;
            case 2 :
                System.out.println("Triveni");
                break;
            case 3 :
                System.out.println("David");
                break;
            case 4 :
                switch (department){
                    case "IT":
                        System.out.println("IT department");
                    case "Comp":
                        System.out.println("comp department");
                }

        }
    }
}
