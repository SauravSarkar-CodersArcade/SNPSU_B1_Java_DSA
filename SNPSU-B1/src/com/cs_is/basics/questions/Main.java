package com.cs_is.basics.questions;

public class Main {
    public static void main(String[] args) {
        int p = 10;
        int q = 20;
        System.out.println(++p + ++q);
        System.out.println(p + " " + q);
        System.out.println(2%3+10*2-1);
        // BODMAS - PEDMAS
        for (int i=0; i<5; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i=0; i<5; ++i){
            System.out.print(i + " ");
        }
    }
}