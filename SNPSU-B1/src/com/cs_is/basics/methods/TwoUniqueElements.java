package com.cs_is.basics.methods;
public class TwoUniqueElements {
    static void twoUniqueElements(int[] arr){
        int n1 = 0, n2 = 0;
        int xorAll = 0;
        for (int i=0; i<arr.length; i++){
            xorAll ^= arr[i];
        }
        int rsb = xorAll & -xorAll;
        for (int i=0; i<arr.length; i++){
            if((arr[i] & rsb) != 0){
                n1 ^= arr[i]; // G1
            }else {
                n2 ^= arr[i]; // G2
            }
        }
        System.out.println("N1= " + n1 + ", N2=" + n2);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,11,12,1,2};
        twoUniqueElements(arr);
    }
}
