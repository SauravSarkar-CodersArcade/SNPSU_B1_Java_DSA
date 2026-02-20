package com.cs_is.basics.Loops;
public class ArrayQuestion {
    public static void main(String[] args) {
        int[] arr = {4,2,1,2,4,1,5};
        int result = 0;
        for (int i=0; i< arr.length; i++){
            result = result ^ arr[i];
        }
        System.out.println("The unique element is: "
        + result);
    }
}
