package com.cs_is.fileHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class BufferedReaderReadFile {
    public static void main(String[] args) throws IOException {
        // Can we create an object of a class inside Constructor
        // ClassAName obj = new ClassAName(new ClassBName());
        BufferedReader reader = new
                BufferedReader(new
                FileReader("./Demo/current_status.txt"));
        String str;
        while ((str = reader.readLine()) != null){
            System.out.println(str);
        }
        reader.close();
    }
}
