package com.cs_is.basics.methods;
public class ReverseInteger {
    static int reverseInteger(int n){
        int ans = 0;
        while (n != 0){
            int digit = n % 10;
            ans = ans * 10 + digit;
            n = n / 10;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(reverseInteger(123));
        System.out.println(reverseInteger(120));
    }
}
