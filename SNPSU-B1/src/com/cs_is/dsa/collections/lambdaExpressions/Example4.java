package com.cs_is.dsa.collections.lambdaExpressions;
import java.util.ArrayList;
// Java StreamAPI - Java 8  (::) -> Streams (->) Lambda
public class Example4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(3);
        list.add(1);
        list.forEach(System.out::println); // STREAM API Java 8
        list.forEach(n -> System.out.println(n)); // Lambda
    }
}
