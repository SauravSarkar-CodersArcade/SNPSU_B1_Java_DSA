package com.cs_is.strings;
// 🟢 String is immutable - we cannot change it
// ❌ We can just create copies - original string doesn't change
// ☑ The concat() method creates a new Object - so result is ignored.️
public class Example2 {
    public static void main(String[] args) {
        String s = "Java";
        s.concat(" Programming");
        System.out.println(s);
    }
}
