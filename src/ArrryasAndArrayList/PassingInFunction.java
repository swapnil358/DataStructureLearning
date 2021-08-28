package ArrryasAndArrayList;

import java.util.Arrays;

public class PassingInFunction {

    public static void main(String[] args) {

        int[] nums = {10,20,30,40};
        System.out.println(Arrays.toString(nums));

        chnage(nums);
        System.out.println(Arrays.toString(nums));


    }

    public static  void chnage(int[] arr) {
        arr[1] = 123;
    }
}
