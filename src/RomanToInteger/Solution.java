package RomanToInteger;

import java.util.Stack;

public class Solution {
    public int romanToInt(String s) {
        char last = s.charAt(0);
        int result = intValue(last);
        for (int i = 1; i < s.length(); i++) {
            char current= s.charAt(i);
            if (intValue(last) < intValue(current)) {
                result += intValue(current) - 2 * intValue(last);
            } else {
                result += intValue(current);
            }
            last = current;
        }
        return result;
    }
    int intValue(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
