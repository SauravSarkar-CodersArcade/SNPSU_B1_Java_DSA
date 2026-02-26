package com.cs_is.strings;
public class BufferBuilderPerformance {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("Java");
        for (int i=1; i<1000000; i++){
            buffer.append(" DSA");
        }
        System.out.println("Buffer time: " +
                (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("Java");
        for (int i=1; i<1000000; i++){
            builder.append(" DSA");
        }
        System.out.println("Builder time: " +
                (System.currentTimeMillis() - startTime) + "ms");
    }
}
