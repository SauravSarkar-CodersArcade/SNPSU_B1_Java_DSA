package com.cs_is.dsa.collections.queues;
import java.util.LinkedList;
import java.util.Queue;
public class FoodOrders {
    public static void main(String[] args) {
        Queue<String> orders = new LinkedList<>();
        // For adding - add() [Fail][Strict], offer() [Not Fail][Not Strict]
        orders.add("Order101"); // Strict Capacity Based
        orders.offer("Order102"); // Flexible
        System.out.println("Orders: " + orders);
        // For removal : remove() -> Strict[Fail] poll() Not Strict[NotFail]
        System.out.println("Serving: " + orders.poll());
        System.out.println("Pending order: " + orders);
        // System.out.println(orders.element());
    }
}
