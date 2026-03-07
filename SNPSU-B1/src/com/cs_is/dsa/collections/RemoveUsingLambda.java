package com.cs_is.dsa.collections;
import java.util.ArrayList;
import java.util.Iterator;
public class RemoveUsingLambda {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(12);
        list.add(22);
        list.add(32);
        list.add(5);
        list.add(6);
        list.add(21);
        System.out.println("Before: " + list);
        list.removeIf(n -> n % 2 == 0);
        System.out.println("After: " + list);
    }
}
