package com.cs_is.arrays.arrayProblems;
public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i=1; i< arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for (int x : prefix){
            System.out.print(x + " ");
        }
    }
}
