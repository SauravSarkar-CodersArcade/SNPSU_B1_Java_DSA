package com.cs_is.dsa.collections.maps;
import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106, "Sharanya");
        ht.put(117, "Shreyas");
        ht.put(128, "Sonika");
        ht.put(100, "Siri");
        ht.put(99, "Sunil");
        ht.put(101, "Prashanth");
        // ht.put(null, "Rahul"); // No null keys allowed in HashTable
        for (Map.Entry<Integer, String> entry : ht.entrySet()){
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
        // ht.remove(98);
        System.out.println(ht);
    }
}
