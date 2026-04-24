package com.cs_is.dsa.algos.greedy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MinNumberOfCoins {
    static void findMinimumCoins(List<Integer> coins, int V){
        List<Integer> result = new ArrayList<>();
        // If the array is not sorted, sort it first
        for (int i= coins.size()-1; i>=0; i--){
            while (V >= coins.get(i)){
                V -= coins.get(i);
                result.add(coins.get(i)); // Add coin to result
            }
        }
        System.out.print("Coins selected: ");
        for (int coin : result){
            System.out.print(coin + " ");
        }
        System.out.println();
        System.out.println("Minimum coins selected: " + result.size());
    }
    public static void main(String[] args) {
        List<Integer> coins = Arrays.asList(1,2,5,10,20,50,100,200,500);
        int V1 = 91;
        findMinimumCoins(coins, V1);
        int V2 = 31;
        findMinimumCoins(coins, V2);
        int V3 = 55;
        findMinimumCoins(coins, V3);

    }
}
