package com.cs_is.threads;
public class ATMTransaction extends Thread {
    public void run(){
        System.out.println("Processing ATM Transaction");
    }
    public static void main(String[] args) {
        ATMTransaction t = new ATMTransaction();
        System.out.println("Thread State: " + t.getState()); // NEW
        t.start();
        System.out.println("Thread state after start: " +
                t.getState()); // RUNNABLE
    }
}
/*
ℹ Code Explanation:
Initially the thread is in the NEW state. After calling start(),
it moves to RUNNABLE and executes the run() method.
The exact timing of the state changes depends on the
JVM Scheduler
ℹ Points to remember:
⭐ Thread is created once.
⭐ start() changes state
⭐ Thread cannot be restarted
⭐ Final state is TERMINATED or DEAD

 */
