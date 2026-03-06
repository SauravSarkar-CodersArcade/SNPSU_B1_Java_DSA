package com.cs_is.dsa.algos.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partitionIndex(int[] arr, int s, int e){
        int pivot = arr[s];
        int count = 0;
        for (int i=s+1; i<=e; i++){
            if(arr[i] < pivot){
                count++;
            }
        }
        // Place the pivot at the correct position or index
        int pivotIndex = s + count;
        swap(arr, pivotIndex, s);
        // Let's manage the left & right side of the pivot
        int i = s, j = e;
        while (i < pivotIndex && j > pivotIndex){
            while (arr[i] < pivot){ // if left side is smaller - move to next
                i++;
            }
            while (arr[j] > pivot){ // if right side is greater - move to next
                j--;
            }
            if(i < pivotIndex && j > pivotIndex){
                swap(arr, i++, j--);
            }
        }
        return pivotIndex;
    }
    public static void quickSort(int[] arr, int s, int e){
        // Base Case // If single element or OutOfBounds
        if(s >= e){
            return;
        }
        // Find the pivot for the partition of the array
        int p = partitionIndex(arr, s, e);
        // Now we use recursion to sort the LHS & RHS
        // Left Part
        quickSort(arr, s, p-1);
        // Right Part
        quickSort(arr, p+1, e);
    }
    public static void main(String[] args) {
        int[] arr = {8,4,7,3,10,2,6};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }
}
