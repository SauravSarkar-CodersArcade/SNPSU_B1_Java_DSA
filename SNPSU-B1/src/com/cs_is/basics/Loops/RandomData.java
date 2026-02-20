package com.cs_is.basics.Loops;
public class RandomData {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
        for (Object o : arr){
            System.out.print(o + " ");
        }
    }
}
