package com.cs_is.dsa.collections.base;
import java.util.ArrayList;
import java.util.Collection;
public class LiveOrders {
    public static void main(String[] args) {
        Collection<String> liveOrders = new ArrayList<>();
        // new orders are added
        liveOrders.add("ORD101");
        liveOrders.add("ORD102");
        liveOrders.add("ORD103");
        // Check order
        System.out.println("ORD103 exists? " +
                liveOrders.contains("ORD103"));
        // Check the live orders
        // liveOrders.remove("ORD102"); This will remove that ORDER ID
        System.out.println("Live Orders: " + liveOrders);
        liveOrders.clear();
        System.out.println("Orders after closing: " + liveOrders);

    }
}
