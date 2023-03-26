package ClimbingStairs;

public class Solution {
    public int climbStairs(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        int first = 1, second = 1, result = first + second;
        for (int i = 2; i < n; i++) {
            first = second;
            second = result;
            result = first + second;
        }
        return result;
    }
}
