package StringtoInteger;

public class Solution {
    public int myAtoi(String s) {
        if (s.length() == 0) {
            return 0;
        }
        s = s.trim();
        char sign = '+';
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
                sign = s.charAt(i);
            } else if (s.charAt(i) == '0' && result.length() == 0) {
                continue;
            } else if (Character.isDigit(s.charAt(i))) {
                result += s.charAt(i);
            } else {
                break;
            }
        }
        if (result.length() == 0) {
            return 0;
        }
        if (sign == '-') {
            result = "-" + result;
        }
        try {
            return Integer.parseInt(result);
        } catch (Exception e) {
            if (sign == '-') {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }
    }
}

