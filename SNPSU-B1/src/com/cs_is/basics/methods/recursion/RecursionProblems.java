package com.cs_is.basics.methods.recursion;
public class RecursionProblems {
    // 1234 = 10
    static int sumOfDigits(int n){
        // base case, corner case, edge case
        if(n == 0){
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }
    static int countDigits(int n){
        if (n == 0){
            return 0;
        }
        return 1 + countDigits(n / 10);
    }
    static int reverse(int n, int rev){
        if(n == 0){
           return rev;
        }
        return reverse(n / 10, rev * 10 + n % 10);
    }
    static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * power(x, n-1);
    }
    static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234));
        System.out.println(countDigits(1234));
        System.out.println(reverse(1234, 0));
        System.out.println(power(2,5));
        System.out.println(fibonacci(8));
    }
}
