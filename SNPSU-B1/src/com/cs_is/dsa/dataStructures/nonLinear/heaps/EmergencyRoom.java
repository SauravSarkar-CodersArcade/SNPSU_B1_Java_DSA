package com.cs_is.dsa.dataStructures.nonLinear.heaps;
import java.util.PriorityQueue;
import java.util.Queue;
public class EmergencyRoom {
    public static void main(String[] args) {
        Queue<Integer> severity = new PriorityQueue<>();
        // 1 -> High Priority
        // 5 -> Low Priority
        // 3 -> Medium Priority
        severity.offer(5);
        severity.offer(3);
        severity.offer(1);
        System.out.println("The patient that gets operated first is Patient: " +
                severity.poll());
        System.out.println("Patient in queue: " + severity);
    }
}
