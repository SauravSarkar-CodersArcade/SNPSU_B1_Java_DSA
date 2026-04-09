package com.cs_is.dsa.dataStructures.nonLinear.heaps;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
public class KthSmallestElement {
    static void findKthSmallest(int[] arr, int k){
        // We will use a Max Heap
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());
        for (int num : arr){
            maxHeap.add(num);
            if (maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        // After the operation, the top element will be the kth smallest
        System.out.println("Kth Smallest in the array: "
        + Arrays.toString(arr) + " is " + maxHeap.peek());
    }
    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 1, 3, 0};
        int k = 3;
        findKthSmallest(arr, k);

    }
}
