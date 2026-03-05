package com.cs_is.arrays.arrayProblems;
public class DifferenceSum {
    public static void main(String[] args) {
        int n = 5;
        int[] diff = new int[n]; // 0 0 0 0 0
        int l = 1;
        int r = 3;
        int val = 10;
        diff[l] += val;  // 0 10 0 0 0
        if((r+1) < n){
            diff[r+1] -= val; // 0 10 0 0 -10
        }
        int[] result = new int[n]; // 0 0 0 0 0
        result[0] = diff[0];
        for (int i=1; i<n; i++){
            result[i] = result[i-1] + diff[i];
        }
        for (int x : result){
            System.out.print(x + " ");
        }

    }
}
