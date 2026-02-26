package com.cs_is.garbageCollection;
public class GCExample {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Python");
        s1 = s2;
        System.gc(); // Not mandatory
        // Now in the string pool, Java is not available
        // That proves that Garbage Collection is Automatic
        System.out.println(s1);
    }
}
