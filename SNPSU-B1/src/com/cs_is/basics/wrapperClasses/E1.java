package com.cs_is.basics.wrapperClasses;
public class E1 {
    public static void main(String[] args) {
        int x = 10;
        Integer obj1 = Integer.valueOf(x); // boxing
        int y = 10;
        Integer obj2 = y; // auto boxing
        System.out.println(obj1);
        System.out.println(obj2);
        Integer obj3 = Integer.valueOf(50);
        int z = obj3.intValue(); // unboxing
        Integer obj4 = Integer.valueOf(100);
        int a = obj4; // auto unboxing
        System.out.println(z);
        System.out.println(a);
        char[] letters = {'M','a','n','i','s','h'};
        String name = new String(letters); // Manish
        System.out.println(name);
    }
}
