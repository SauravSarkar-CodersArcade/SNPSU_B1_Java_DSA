package com.cs_is.exceptions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class E4 {
    public static void main(String[] args) throws IOException {
        String str;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter any data:");
            str = br.readLine();
            System.out.println(str);
            br.close(); // Not needed - Closed Automatically by Autocloseable
        }
    }
}
