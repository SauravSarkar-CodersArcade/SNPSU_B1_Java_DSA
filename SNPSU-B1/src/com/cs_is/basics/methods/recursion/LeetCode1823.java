package com.cs_is.basics.methods.recursion;
public class LeetCode1823 {
    static int solve(int n, int k){
        // Base Case
        if(n == 1){
            return 0;
        }
        return (solve(n-1, k) + k) % n;
    }
    static int findWinner(int n, int k){
        return solve(n,k) + 1; // For 1 - modulo answer
    }
    public static void main(String[] args) {
        System.out.println(findWinner(5,2));
        System.out.println(findWinner(6,5));
    }
}
