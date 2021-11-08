package Recursion;

public class FibonacciNumber {

    public static void main(String[] args) {
        System.out.println(feboNumber(6));
    }

    static int feboNumber(int n) {
        if (n < 2) {
            return n;
        }
        return feboNumber(n - 1) + feboNumber(n - 2);
    }

}
