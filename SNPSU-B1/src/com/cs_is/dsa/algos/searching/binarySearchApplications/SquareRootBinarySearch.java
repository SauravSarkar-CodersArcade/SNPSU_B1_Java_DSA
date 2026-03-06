package com.cs_is.dsa.algos.searching.binarySearchApplications;
public class SquareRootBinarySearch {
    public static int sqrt_bs(int n){
        int s = 0;
        int e = n;
        int ans = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            int square = mid * mid;
            if(square == n){
                return mid;
            }else if(square > n){
                e = mid - 1; // Go to the left hand side
            }else {
                // Store the probable answer & move to the right
                ans = mid; // The mid-value is stored in the answer
                s = mid + 1; // We move to the right to find accurate ans
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(sqrt_bs(36));
        System.out.println(sqrt_bs(37));
    }
}
