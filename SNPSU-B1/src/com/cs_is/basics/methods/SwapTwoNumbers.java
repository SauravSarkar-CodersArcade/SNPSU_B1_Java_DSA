package com.cs_is.basics.methods;
public class SwapTwoNumbers {
    static void swap(int a, int b){ // 20,30
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside Swap: a=" + a + ",b=" + b); // 30,20
    }
    public static void main(String[] args) {
        int x = 20;
        int y = 30;
        System.out.println("Before: x=" + x + ",y=" + y);
        swap(x,y); // Copies of the variables are going x[1000] y[2000]
        System.out.println("After: x=" + x + ",y=" + y);
    }
}
