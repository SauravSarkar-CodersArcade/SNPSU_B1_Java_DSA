package com.cs_is.basics.methods;
public class MaxRegions {
    static int maxRegions(int lines){
        return ((lines * (lines + 1))/2) + 1;
    }
    static int maxPieces(int cuts){
       return ((cuts * (cuts + 1))/2) + 1;
    }
    public static void main(String[] args) {
        System.out.println(maxRegions(5)); // 16
        System.out.println(maxPieces(4)); // 11
    }
}
