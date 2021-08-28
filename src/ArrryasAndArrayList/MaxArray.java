package ArrryasAndArrayList;

public class MaxArray {

    public static void main(String[] args) {
        int[] arr = {12, 54, 32, 89, 100};
        getMaxArray(arr);
    }

    private static int getMaxArray(int[] arr) {
        int max = 0;

        if (arr == null) {
            return -1;
        }

        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max arrays is: " + max);
        return max;
    }
}
