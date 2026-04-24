package com.cs_is.fileHandling;
import java.io.FileWriter;
public class WriteDataIntoFile {
    public static void main(String[] args) throws Exception{
        FileWriter writer = new
                FileWriter("./Demo/current_status.txt",
                true);
        writer.append("\nConsistency is the key.");
        writer.close();
        System.out.println("Wrote data into the file.");
    }
}
