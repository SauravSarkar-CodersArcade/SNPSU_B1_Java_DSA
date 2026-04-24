package com.cs_is.dsa.algos.dynamicProgramming.oneD;
public class FibonacciSpaceOptimized {
    public static int fib(int n){
        if(n <= 1) return n;
        int p2 = 0, p1 = 1; // Space Complexity O[1] Constant
        for (int i=2; i<=n; i++){ //[BigO(n)]
            int curr = p2 + p1;
            p2 = p1;
            p1 = curr;
        }
        return p1;
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println("The fib of the index " + n + " is "
        + fib(n));
    }
}
