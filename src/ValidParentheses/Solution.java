package ValidParentheses;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if (s.length() == 0) return true;
        if (s.length() % 2 != 0) return false;
        if (s.length() == 1) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '{' || current == '[' || current == '(') {
                stack.push(current);
            } else if (current == '}' || current == ']' || current == ')') {
                if (stack.empty()) return false;
                if (!checkBracketsCorrespondence(current, stack.pop())) {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    private boolean checkBracketsCorrespondence(char current, Character pop) {
        if (current == '}' && pop == '{') return true;
        if (current == ']' && pop == '[') return true;
        if (current == ')' && pop == '(') return true;
        return false;
    }
}
