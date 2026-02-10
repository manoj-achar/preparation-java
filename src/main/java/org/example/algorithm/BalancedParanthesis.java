package org.example.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedParanthesis {

    static void main() {
        String input = "[{()()}]{[}]";
        System.out.println("Input: '"+input+"'");
        System.out.println("Expected: false");
        System.out.println("Actual: " + isBalancedParentheses(input));
        System.out.println();
    }

    public static boolean isBalancedParentheses(String input) {
        if(input.isEmpty()) return true;
        if(input.length() == 1) return false;
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> paranthesisMap = new HashMap<>();
        paranthesisMap.put(')', '(');
        paranthesisMap.put('}', '{');
        paranthesisMap.put(']', '[');

        for(int i = 0; i<input.length(); i++) {
            char ch = input.charAt(i);
            if(paranthesisMap.containsKey(ch)) {
                if(stack.isEmpty() || !stack.peek().equals(paranthesisMap.get(ch))) return false;
                if(stack.peek().equals(paranthesisMap.get(ch))) stack.pop();
            } else {
                stack.push(ch);
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}
