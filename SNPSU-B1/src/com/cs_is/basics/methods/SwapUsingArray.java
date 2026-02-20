package com.cs_is.basics.methods;
public class SwapUsingArray {
    static void swap(int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
    public static void main(String[] args) {
        int x = 10, y = 20;
        System.out.println(x + ", " + y);
        int[] arr = {x , y};
        swap(arr);
        x = arr[0];
        y = arr[1];
        System.out.println(x + ", " + y);
    }
}
