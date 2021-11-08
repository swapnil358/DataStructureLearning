package Searching.BinarySearch.BinarySearchPorblems;

public class MoveElementToEnd {


    static int[] MoveElementToEnd1(int arr[], int value) {
        int i, j;
        i = 0;
        j = arr.length - 1;

        while (i < j) {
            while (arr[j] == value) {
                j--;
            }
            if (arr[i] == value) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else {
                i++;
            }
        }
        for(int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        return arr;
    }

    static boolean ValidateSubsequence(int arr[], int seq[]) {
        int i, j;
        i = j = 0;
        if (seq.length > arr.length)
            return false;
        if (seq.length == 0 || arr.length == 0)
            return false;

        //arr = [1,2,3];
        //seq = [1,4,5,5,6,3,1,2,7];
        while (i < arr.length && j < seq.length) {
            if (arr[i] == seq[j]) {
                i++;
                j++;

            } else {
                i++;
            }
        }
        if (j > seq.length - 1) {
            return true;
        } else
            return false;
    }


    static void IsPrime(int n) {
        if (n < 1) return;


        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(n + " is a prime number");
        }
        //n = n-1;
        IsPrime(--n);

    }

    public static void main(String[] args) {


        //arr = [1,2,3,4,5];
        //seq = [1,4,5];
        int arr[] = {2, 0, 1, 3, 0, 6, 1, 0};
        //int seq[] = {};
        //System.out.println(ValidateSubsequence(arr,seq));


        int resultArr[] = MoveElementToEnd1(arr, 3);


    }
}
