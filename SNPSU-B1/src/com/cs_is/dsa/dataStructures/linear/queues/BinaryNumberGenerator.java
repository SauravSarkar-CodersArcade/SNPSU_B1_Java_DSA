package com.cs_is.dsa.dataStructures.linear.queues;
import java.util.LinkedList;
import java.util.Queue;
public class BinaryNumberGenerator {
    public static void generateBinaryNumbers1toN(int N){
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        while (N-- > 0){
            String curr = q.poll();
            System.out.print(curr + " "); // Print the latest
            q.offer(curr + "0"); // Concatenate 0 & push to queue
            q.offer(curr + "1"); // Concatenate 1 & push to queue
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int N = 5;
        generateBinaryNumbers1toN(N);
        generateBinaryNumbers1toN(6);
    }
}
