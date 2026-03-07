package com.cs_is.dsa.collections.lambdaExpressions;
interface Square {
    int calculate(int x);
}
public class Example3 {
    public static void main(String[] args) {
        Square s = x -> x * x;
        System.out.println("Square: " + s.calculate(9));
    }
}
