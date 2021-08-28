package com.com.assignments;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {


        getFun(12,4,65,54,1,2,1,269,54);

    }

    private static void getFun(int ...v) {   //variable arguments, you can pass n number of argument as integer array
        System.out.println(Arrays.toString(v));
    }
}
