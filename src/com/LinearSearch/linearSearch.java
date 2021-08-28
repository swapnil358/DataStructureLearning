package com.LinearSearch;

public class linearSearch {

    public static void main(String[] args) {
        int[] arr = {4, 78, 564, 54, 3, 98, 5, -1};
        int a = LinearSearch(arr, 65);
       // System.out.println("Element present at index: "+a);

        boolean b = LinearSearch2(arr, 101);
        //System.out.println("Element present: " + b);

        int c = LinearSearch3(arr, 55);
        System.out.println(c);

    }


     private static int LinearSearch(int[] arr, int element){
        if (arr == null) {
            return -1;
        }
        for (int index = 0; index < arr.length ; index++) {
            if (element == arr[index]) {
                return index;
            }
        }
       return -1;
    }


    static boolean LinearSearch2(int[] arr, int element) {

        if (arr == null) {
            return false;
        }
        for (int index = 0; index < arr.length; index++) {
            if (element == arr[index]) {
                return true;
            }
        }
        return false;
    }

    static int LinearSearch3(int[] arr, int element) {
        if (arr == null) {
            return -1;
        }
        for (int i : arr) {
            if (element == i) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }


}
