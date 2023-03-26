package ReverseInteger;

class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        if (isNegative) x = Math.abs(x);
        int newNum = 0;
        while (x > 0) {
            if (newNum > Integer.MAX_VALUE / 10) return 0;
            newNum = newNum * 10 + x % 10;
            x /= 10;
            System.out.println("newNum = " + newNum);
            System.out.println("x = " + x);
        }
        return isNegative ? -newNum : newNum;
    }
}