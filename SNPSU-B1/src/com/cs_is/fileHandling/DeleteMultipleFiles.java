package com.cs_is.fileHandling;
import java.io.File;
public class DeleteMultipleFiles {
    public static void main(String[] args) {
        String[] files = {"java.txt", "python.txt", "sql.txt"};
        String path = "./Demo/"; // ./Demo/java.txt
        for (int i=0; i< files.length; i++){
            File file = new File(path + files[i]);
            if (file.delete()){
                System.out.println("File: " +
                        file.getName() + " deleted.");
            }else {
                System.out.println("Failed to delete the file.");
            }
        }
    }
}
