package StackQueue;

// 20. Valid Parentheses
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
// determine if the input string is valid.
// An input string is valid if:
// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.


import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '(' || c == '[')
                stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                boolean isValid = false;
                if (c == '}' && stack.peek() == '{') isValid = true;
                if (c == ')' && stack.peek() == '(') isValid = true;
                if (c == ']' && stack.peek() == '[') isValid = true;
                if (!isValid) return false;
                else stack.pop();
            }
        }
        if (!stack.isEmpty()) return false;
        return true;
    }
}
