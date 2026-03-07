package com.cs_is.dsa.bitManipulations;
public class FindTheValueOfRSB {
    public static void main(String[] args) {
        int n = 12; // 1100 = 4
        int result = n & -n;
        System.out.println("Rightmost Set Bit Value: " +
                result);
        System.out.println(~-5000);

    }
}
