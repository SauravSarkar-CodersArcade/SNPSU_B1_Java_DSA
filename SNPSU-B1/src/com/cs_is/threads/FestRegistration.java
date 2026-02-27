package com.cs_is.threads;
public class FestRegistration {
    static class FormFilling extends Thread {
        public void run(){
            System.out.println("Form Filling Started!");
        }
    }
    static class DocumentsUpload extends Thread {
        public void run(){
            System.out.println("Document Upload Started!");
        }
    }
    static class EmailNotification extends Thread{
        public void run(){
            System.out.println("Confirmation Email Sent!");
        }
    }
    public static void main(String[] args) {
        FormFilling t1 = new FormFilling();
        DocumentsUpload t2 = new DocumentsUpload();
        EmailNotification t3 = new EmailNotification();
        t1.start();
        t2.start();
        t3.start();
    }
}
/*
Points to remember
⭐ Java program starts with one main thread.
⭐ Threads allow parallel execution -> concurrency
⭐ Output order is not guaranteed
⭐ Threads share the same memory
⭐ Improves the performance & responsiveness
⭐ When start() is called, the JVM creates a new Thread
⭐ When run() is called directly, there is no concurrency
ℹ Process Vs Thread
⭐ Process is a running program
⭐ Thread : A path of execution inside the program
⭐ A process has its own memory
⭐ Threads share the same memory
⭐ Creating a Thread is cheaper than creating a Process
⭐ Examples: Process -> Chrome Browser Thread -> New Tab Of Chrome
🟢 Closing a tab will not close Chrome or kill Chrome
 */
