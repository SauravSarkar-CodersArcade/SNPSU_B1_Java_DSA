package com.cs_is.fileHandling;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class BufferedReaderWriteData {
    public static void main(String[] args) throws Exception{
        String[] names = {"Nirmal", "Anup", "Raushan"};
        BufferedWriter writer = new
                BufferedWriter(
                        new FileWriter("./Demo/demo.txt",
                                true));
        writer.write("\nWriting line 4 to the file.");
        for (String name : names){
            writer.write("\n" + name);
        }
        writer.close();

    }
}
