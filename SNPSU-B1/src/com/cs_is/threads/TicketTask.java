package com.cs_is.threads;
public class TicketTask implements Runnable {
    String task;
    TicketTask(String task){
        this.task = task;
    }
    public void run(){
        System.out.println(task + " in progress.");
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new TicketTask("Seat Assignment"));
        Thread t2 = new Thread(new TicketTask("Payment Processing"));
        Thread t3 = new Thread(new TicketTask("SMS Notification"));
        t1.start();
        t2.start();
        t3.start();
    }
}
/*
ℹ Points to remember ️
Each Runnable Object is a job, and the Thread class is
responsible only for execution, which makes this approach
cleaner & more flexible.
⭐ implements Runnable
⭐ Better design
⭐ Interviewers mostly ask this
⭐ Supports multiple inheritance via interfaces
 */

