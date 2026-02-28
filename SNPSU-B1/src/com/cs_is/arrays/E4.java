package com.cs_is.arrays;
public class E4 {
    // Passing array into method -> Array is call by reference
    public static void printArray(int[] arr){
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static int[] createArray(){  // returns an array of integers
        return new int[]{10,20,30}; // new array created & returned
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printArray(arr);
        int[] result = createArray();
        for (int num : result){
            System.out.print(num + " ");
        }
        System.out.println();
        // Anonymous array -> we don't have a reference / object.
        // After the method call, we can never access it.
        printArray(new int[]{100,200,200});
    }
}
