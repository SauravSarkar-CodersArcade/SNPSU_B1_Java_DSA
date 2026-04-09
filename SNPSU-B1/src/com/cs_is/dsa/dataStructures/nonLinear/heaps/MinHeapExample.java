package com.cs_is.dsa.dataStructures.nonLinear.heaps;
import java.util.PriorityQueue;
public class MinHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // 2 9 6 8 4 3 1 0
        minHeap.offer(2);
        minHeap.offer(9);
        minHeap.offer(6);
        minHeap.offer(8);
        minHeap.offer(4);
        minHeap.offer(3);
        minHeap.offer(1);
        minHeap.offer(0);
        System.out.println("Min Heap: " + minHeap);
        System.out.println(minHeap.poll());
    }
}
