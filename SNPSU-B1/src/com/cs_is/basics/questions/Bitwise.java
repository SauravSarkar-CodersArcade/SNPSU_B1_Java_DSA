package com.cs_is.basics.questions;

public class Bitwise {
    public static void main(String[] args) {
        System.out.println(7 & 9);
        System.out.println(6 | 5);
        System.out.println(3 ^ 8);
        System.out.println(10 >> 2);
        System.out.println(10 << 2);
        System.out.println(~-5000);
        int n = 9;
        if ((n & (n-1)) == 0){
            System.out.println("PO2");
        }else {
            System.out.println("NPO2");
        }
    }
}
