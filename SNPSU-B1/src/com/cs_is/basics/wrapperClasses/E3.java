package com.cs_is.basics.wrapperClasses;
public class E3 {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        // ref1 = ref2
        System.out.println(a == b); // true
        // Integer Parsed value : (-128 to 127)
        Integer c = 200;
        Integer d = 200;
        // ref1 != ref2
        System.out.println(c == d); // false

    }
}
