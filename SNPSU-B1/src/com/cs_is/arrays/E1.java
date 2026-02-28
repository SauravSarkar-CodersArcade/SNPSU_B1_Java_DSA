package com.cs_is.arrays;
public class E1 {
    public static void main(String[] args) {
        // Method 1
        int[] arr1; // Declaration
        arr1 = new int[5]; // Memory Allocation [20 bytes]
        // Declaration + Memory Allocation in single line
        // If we don't provide value
        // The JVM uses "Fallback Mechanism"
        // It uses the default value of that data type
        // Method 2
        int[] arr2 = new int[5];
        System.out.println(arr2[4]); // 0
        System.out.println(arr1[3]); // 0
        // Method 3
        int[] arr3 = {1,2,3,4,5};
        // Method 4
        int[] arr4 = new int[]{1,2,3,4,5};
    }
}
