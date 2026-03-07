package com.cs_is.dsa.collections.maps;
import java.util.HashMap;
public class FrequencyMap {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1,4};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr){
            // {1=2, 2=2, 3=1, 4=1}
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);
        System.out.println(map.get(4));

    }
}
