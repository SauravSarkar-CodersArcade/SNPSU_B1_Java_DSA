package com.cs_is.dsa.bitManipulations;
public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int n = arr.length + 1;
        int xor1 = 0;
        int xor2 = 0;
        for (int i=1; i<=n; i++){
            xor1 ^= i; // 1 ^ 2 ^ 3 ^ 4 ^ 5
        }
        for (int num : arr){
            xor2 ^= num; // 1 ^ 2 ^ 3 ^ 5
        }
        int missing = xor1 ^ xor2; // (1 ^ 2 ^ 3 ^ 4 ^ 5) ^  (1 ^ 2 ^ 3 ^ 5)
        System.out.println("Missing Element: " + missing);
    }
}
