package com.cs_is.basics.methods;
public class InterviewOnSwapping {
    static void change(int x){
         x = 100;
    }
    static void increment(int[] arr){
        arr[0]++;
    }
    public static void main(String[] args) {
        int a = 10;
        change(a);
        System.out.println(a);
        int[] array = {5};
        increment(array);
        System.out.println(array[0]);
    }
}
