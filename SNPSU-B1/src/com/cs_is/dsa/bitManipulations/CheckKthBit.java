package com.cs_is.dsa.bitManipulations;
public class CheckKthBit {
    public static void main(String[] args) {
        int n = 4;
        int k = 1;
        if( (n & (1 << k)) != 0 ){
            System.out.println("Bit is set.");
        }else {
            System.out.println("Bit is not set.");
        }
    }
}
