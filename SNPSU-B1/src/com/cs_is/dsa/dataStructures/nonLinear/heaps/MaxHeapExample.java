package com.cs_is.dsa.dataStructures.nonLinear.heaps;
import java.util.Collections;
import java.util.PriorityQueue;
public class MaxHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new
                PriorityQueue<>(Collections.reverseOrder());
        // 2 9 6 8 4 3 1 0
        maxHeap.offer(2);
        maxHeap.offer(9);
        maxHeap.offer(6);
        maxHeap.offer(8);
        maxHeap.offer(4);
        maxHeap.offer(3);
        maxHeap.offer(1);
        maxHeap.offer(0);
        System.out.println("Max Heap: " + maxHeap);
        System.out.println(maxHeap.poll());
    }
}
