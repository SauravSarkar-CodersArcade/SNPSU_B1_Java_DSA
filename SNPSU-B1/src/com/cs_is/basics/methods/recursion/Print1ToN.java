package com.cs_is.basics.methods.recursion;
public class Print1ToN {
    static void print(int n){
        if (n == 0){
            return;
        }
        print(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        print(5);
    }
}
