package com.cs_is.dsa.collections.lists;
import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek()); // Display top element
        System.out.println("Size: " + stack.size());
        stack.pop(); // Remove top element
        System.out.println("Size: " + stack.size());
        System.out.println(stack);
        System.out.println(stack.empty());
    }
}
