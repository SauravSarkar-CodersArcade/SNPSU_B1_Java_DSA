package com.cs_is.dsa.bitManipulations;
import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if((n & (n-1)) == 0){
            System.out.println(n + " POWER OF 2");
        }else {
            System.out.println(n + " NOT POWER OF 2");
        }
    }
}
