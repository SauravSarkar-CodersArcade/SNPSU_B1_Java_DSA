package com.cs_is.dsa.collections.maps;
import java.util.TreeMap;
public class TreemapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");
        System.out.println(map);
    }
}
