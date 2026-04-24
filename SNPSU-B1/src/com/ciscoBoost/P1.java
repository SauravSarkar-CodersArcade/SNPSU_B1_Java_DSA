package com.ciscoBoost;
public class P1 {
    public static void main(String[] args) {
        // Climbing Stairs LC 70
        // cauliflower, education
        String s = "mozambique";
        int count = 0;
        for (char ch : s.toCharArray()){
            if("aeiouAEIOU".indexOf(ch) != -1)
                count++;
        }
        System.out.println(count);
    }
}
