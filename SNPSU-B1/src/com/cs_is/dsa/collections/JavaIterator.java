package com.cs_is.dsa.collections;
import java.util.ArrayList;
import java.util.Iterator;
public class JavaIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(12);
        list.add(22);
        list.add(32);
        list.add(5);
        list.add(6);
        list.add(21);
        System.out.println(list);
        Iterator<Integer> it = list.iterator();
        // Remove the elements which are greater than 10
        while (it.hasNext()){
            Integer i = it.next();
            if (i > 10){
                it.remove();
            }
        }
        System.out.println(list);
    }
}
