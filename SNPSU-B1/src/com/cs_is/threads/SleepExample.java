package com.cs_is.threads;
public class SleepExample {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Printing 0-9:");
        for (int i=0; i<10; i++){
            System.out.println("Printed: " + i);
            Thread.sleep(2000);
        }
        System.out.println("Done");
    }
}
/*
Here, the Thread is paused for a fixed duration of time.
The Thread doesn't lock anything and resumes after the given time.
 */
