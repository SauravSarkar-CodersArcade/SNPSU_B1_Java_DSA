package com.cs_is.dsa.bitManipulations;
public class MultiplyAndDivideBy2 {
    public static void main(String[] args) {
        int n = 5;   // 0101 << 1 = 1010
        int result = n << 1; // Multiplied By 2
        System.out.println("Result: " + result);
        int x = 50;
        int res = x >> 1; // Divided by 2
        System.out.println("Res: " + res);
    }
}
