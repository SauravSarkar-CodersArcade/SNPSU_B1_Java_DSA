package com.cs_is.arrays.arrayProblems;
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,2,2,2};
        int candidate = 0;
        int count = 0;
        for (int i=0; i<arr.length; i++){
            if(count == 0){
                candidate = arr[i];
            }
            if (arr[i] == candidate){
                count++;
            }else {
                count--;
            }
        }
        System.out.println("Majority element: " + candidate);
    }
}
