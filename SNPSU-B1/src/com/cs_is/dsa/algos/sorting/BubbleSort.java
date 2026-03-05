package com.cs_is.dsa.algos.sorting;
import java.util.Arrays;
public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i=1; i < n; i++){ // 1 to n-1 => < n [Iterations]
            for (int j = 0; j < n-i; j++){ // Go till the 2nd last
                if(arr[j] > arr[j+1]){
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,2,1,3,7,6,5};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
