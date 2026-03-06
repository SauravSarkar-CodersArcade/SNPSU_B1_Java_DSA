package com.cs_is.dsa.collections.lists;
import java.util.ArrayList;
import java.util.List;
public class ShoppingCart {
    public static void main(String[] args) {
        List<String> cart = new ArrayList<>();
        cart.add("Laptop");
        cart.add("Mouse");
        cart.add("Keyboard");
        cart.remove("Mouse"); // Removes the item
        cart.set(1, "Mechanical Keyboard"); // Update
        System.out.println("Cart Items: " + cart);
        System.out.println("Total Items: " + cart.size());
    }
}
