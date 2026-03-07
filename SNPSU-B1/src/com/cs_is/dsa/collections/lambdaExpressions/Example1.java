package com.cs_is.dsa.collections.lambdaExpressions;
public class Example1 {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("Thread is running using Lambda(->)");
        };
        Thread t = new Thread(r);
        t.start();
    }
}
