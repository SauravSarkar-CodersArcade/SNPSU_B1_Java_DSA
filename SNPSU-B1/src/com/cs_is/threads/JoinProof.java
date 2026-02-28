package com.cs_is.threads;
public class JoinProof {
    static class Task extends Thread {
        public void run(){
            try {
                Thread.sleep(2000);
            }catch (Exception e){}
            System.out.println("Task Finished!");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Task t = new Task();
        t.start(); // The main thread doesn't wait for this Thread
        t.join(); // Code will wait (guaranteed!!)
        System.out.println("Main Thread Resumes.");
    }
}
