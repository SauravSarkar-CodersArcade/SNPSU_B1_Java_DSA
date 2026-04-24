package com.cs_is.dsa.algos.dynamicProgramming.oneD;
public class FibonacciRecursion {
    public static int fibonacci(int n){
        // Edge case, corner case
        if (n <= 1){
            return n; // n= 0, return 0, n= 1 return 1
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Fibonacci at index " + n +  " is: "
                + fibonacci(n));
    }
}
