package com.cs_is.dsa.dataStructures.linear.stacks;
import java.util.Stack;
public class ValidParentheses {
    static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {  // {,(,[,],),}
            if (c == '(' || c== '[' || c == '{'){
                // Push opening braces onto the stack
                stack.push(c);
            }
            else {
                if (stack.empty()){
                    return false;
                }
                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        return stack.empty();
        // The string is a Valid Parentheses if all characters are removed
        // It is invalid if there are some mismatched characters
    }
    public static void main(String[] args) {
        String s1 = "{[()]}";
        String s2 = "{]{](]";
        String s3 = "(([[";
        System.out.println(s1 + " -> " + (isValid(s1) ? "Valid" : "Invalid"));
        System.out.println(s2 + " -> " + (isValid(s2) ? "Valid" : "Invalid"));
        System.out.println(s3 + " -> " + (isValid(s3) ? "Valid" : "Invalid"));
    }
}
