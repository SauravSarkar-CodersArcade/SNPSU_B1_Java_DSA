package com.cs_is.strings;

public class StringPool {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1 == s2); // ℹ️Checks values
        String s3 = new String("Java");
        System.out.println(s1 == s3); // ℹ Checks references / objects
        System.out.println(s1.equals(s3)); // ℹ Checks values
    }
}
/*
* 🟢 s1 & s2 share same object in POOL
* 🟢 new String() creates new heap object
* 🟢 == compares references
* 🟢 .equals() compares values
 */
