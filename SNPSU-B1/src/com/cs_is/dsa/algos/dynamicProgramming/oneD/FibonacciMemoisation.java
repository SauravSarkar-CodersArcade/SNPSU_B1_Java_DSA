package com.cs_is.dsa.algos.dynamicProgramming.oneD;
import java.util.Arrays;
public class FibonacciMemoisation {
    public static int fib(int n, int[] dp){
        // Base case
        if(n <= 1) return n;
        // Step 2: If you have the value don't calculate, just return
        if (dp[n] != -1){
            return dp[n];
        }
        // Step 3: If you don't know, calculate the answer
        return dp[n] = fib(n-1, dp) + fib(n-2, dp);
    }

    public static void main(String[] args) {
        int n = 6;
        // Step 1: Create a 1D dp table of size n+1 (0-based)
        int[] dp = new int[n+1]; // 0-based indexing
        // Sub step of 1: Fill the array with default values -1
        Arrays.fill(dp, -1);
        System.out.println("Fibonacci at index " + n +  " is: "
                + fib(n, dp));
    }
}
