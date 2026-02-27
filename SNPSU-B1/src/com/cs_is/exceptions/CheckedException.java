package com.cs_is.exceptions;
import java.io.IOException;
/*
⭐ java.io.IOException -> Fully Qualified ClassName
⭐ For checked exceptions we always use try-catch block
⭐ the 'throws' keyword doesn't handle the exception
⭐ It only passes on the information to the calling method
⭐ The calling method has to handle the exception using try-catch
⭐ The 'throws' keyword is written in the method signature (name)
 */
public class CheckedException {
    static void readFile()throws IOException {
        throw new IOException("File not found!");
    }
    public static void main(String[] args) {
        try {
            display();
        } catch (IOException e) {
            System.out.println(e.getMessage()); // This is for the ("Message")
        }
    }
    static void display() throws IOException {
        readFile();
    }
}
