package com.cs_is.basics.methods;
class Number {
    int value;
}
public class Swap {
    static void swap(Number n1, Number n2){
        int temp = n1.value;
        n1.value = n2.value;
        n2.value = temp;
    }
    public static void main(String[] args) {
        Number a = new Number();
        Number b = new Number();
        a.value = 10;
        b.value = 20;
        swap(a,b); // 1000[10] 2000[20]
        System.out.println(a.value + " " + b.value);
    }
}
