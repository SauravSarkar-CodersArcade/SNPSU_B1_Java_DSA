package com.cs_is.dsa.collections.sets;
import java.util.ArrayList;
import java.util.List;
public class Wildcards {
    public static void printList(List<?> list){
        for (Object o : list){
            System.out.print(o + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Java");
        strings.add("Python");
        strings.add("C++");
        printList(strings);
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(4);
        printList(integers);
    }
}
