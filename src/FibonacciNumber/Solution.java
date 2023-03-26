package FibonacciNumber;

public class Solution {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        int first = 0, second = 1, result = first + second;
        for (int i = 2; i < n; i++) {
            first = second;
            second = result;
            result = first + second;
        }
        return result;
    }
}
