package com.cs_is.garbageCollection;
public class GCDemo {
    public static void main(String[] args) {
        GCDemo obj = new GCDemo();
        obj = null;
        System.gc();
        // Now-a-days the gc() method is automatically invoked
        // after program execution by the Object Class
        // for clutter, garbage collection & removal by the JVM
        // 🟢 We do not need to call it explicitly
        System.out.println("GC Requested!");
    }
}
