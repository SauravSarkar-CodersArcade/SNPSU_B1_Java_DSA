package com.cs_is.strings;
public class StringUseCase {
    public static void main(String[] args) {
        String message = "Order Confirmed";
        message = message + " - ID: 101";
        System.out.println(message);
//        message = message + " - ID: 102";
//        System.out.println(message);
    }
}
/*
✅ String is Immutable
✅ Stored in SCP (String Constant Pool)
✅ Every modification creates a new Object -> Heap memory
✅ Good for read-only data
 */
