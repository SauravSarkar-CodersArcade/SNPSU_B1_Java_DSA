package com.cs_is.dsa.collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;
    public LRUCache(int capacity){
        // the 'true' at the end is the magic ingredient
        // It tells the map to order items by access time,
        // not insertion time
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }
    // This is a built-in method in LinkedHashMap
    // We override it to tell Java exactly when to start
    // kicking old items out
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        // If the size gets bigger than our capacity, return true
        // (Kick the oldest out)
        return size() > capacity;
    }

    public static void main(String[] args) {
        // Let's build our 3-pair shoe rack
        LRUCache<String , String> shoeRack = new LRUCache<>(3);
        shoeRack.put("Monday", "Sneakers");
        shoeRack.put("Tuesday", "Boots");
        shoeRack.put("Wednesday", "Sandals");
        System.out.println("Rack Contents: " + shoeRack);

        // Now let's say we access the "Sneakers" again on Thursday
        // This makes Sneakers the MOST recently used
        shoeRack.get("Monday");
        System.out.println("Rack Contents: " + shoeRack);

        // We buy a new Loafers and try to put them on the rack
        shoeRack.put("Thursday", "Loafers");
        // Let's see what got kicked out
        System.out.println("Rack after adding Loafers: " + shoeRack);
        // We notice that Boots have been ticked out,
        // because Sneakers were just accessed.
    }
}
