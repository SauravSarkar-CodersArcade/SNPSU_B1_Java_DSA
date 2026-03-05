package com.cs_is.arrays.arrayProblems;
public class PartitionArray {
    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 12, 7, 6};
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            while (arr[left] % 2 == 0){
                left++; // If the left side has even nos, move forward
            }
            while (arr[right] % 2 != 0){
                right--; // If the right side has odd numbers, move backwards
            }
            if(left < right){ // If the numbers & sides don't match, swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        for (int x : arr){
            System.out.print(x + " ");
        }
    }

}
