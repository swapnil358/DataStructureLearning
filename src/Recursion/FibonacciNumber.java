package Recursion;

public class FibonacciNumber {

    public static void main(String[] args) {
        int feboNumber = feboNumber(4);
        System.out.println(feboNumber);
    }

    static int feboNumber(int n) {
        if (n < 2) {
            return n;
        }
        return feboNumber(n - 1) + feboNumber(n - 2);
    }
}
