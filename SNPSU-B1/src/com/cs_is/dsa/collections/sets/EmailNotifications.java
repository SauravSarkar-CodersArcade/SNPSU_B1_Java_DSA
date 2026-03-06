package com.cs_is.dsa.collections.sets;
import java.util.HashSet;
import java.util.Set;
public class EmailNotifications {
    public static void main(String[] args) {
        Set<String> emailQueue = new HashSet<>();
        emailQueue.add("a@gmail.com");
        emailQueue.add("b@gmail.com");
        emailQueue.add("a@gmail.com");
        emailQueue.add("b@gmail.com");
        emailQueue.add("c@gmail.com");
        emailQueue.add("d@gmail.com");
        System.out.println("Emails to send: " + emailQueue);
        System.out.println("Unique emails: " + emailQueue.size());
    }
}
