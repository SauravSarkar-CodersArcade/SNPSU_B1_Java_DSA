package com.cs_is.threads;
public class ThreadWithPriority extends Thread {
    public void run(){
        for (int i=1; i<=3; i++){
            System.out.println(Thread.currentThread().getName() +
                    " | Priority: " +
                    Thread.currentThread().getPriority());
        }
    }
    public static void main(String[] args) {
        ThreadWithPriority t1 = new ThreadWithPriority();
        ThreadWithPriority t2 = new ThreadWithPriority();
        ThreadWithPriority t3 = new ThreadWithPriority();
        t1.setName("Low Priority Thread");
        t2.setName("Medium Priority Thread");
        t3.setName("High Priority Thread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        // t3.setPriority(11); IllegalArgumentException
        t1.start();
        t2.start();
        t3.start();
    }
}
/*
ℹ Points to remember:
⭐ Thread Priority is only a suggestion to the JVM or the scheduler.
⭐ Higher priority doesn't guarantee execution order.
⭐ Higher priority threads may get more CPU Scheduler time.
⭐ The actual behaviour depends on the JVM & Operating System
 */
