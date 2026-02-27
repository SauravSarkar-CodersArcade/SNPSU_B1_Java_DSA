package com.cs_is.threads; // Parallel Execution

import com.cs_is.oops.pillars.inheritance.hybrid.Student;

public class FoodOrder extends Thread {
    String task;
    FoodOrder(String task){
        this.task = task;
    }
    public void run(){
        System.out.println(task + " started");
    }
    public static void main(String[] args) {
        FoodOrder cooking = new FoodOrder("Cooking");
        FoodOrder packing = new FoodOrder("Packing");
        FoodOrder delivery = new FoodOrder("Assigning Delivery Agent");
        cooking.start();
        packing.start();
        delivery.start();
    }
}
/*
ℹ Points to remember
⭐ Extend Thread
⭐ Override run()
⭐ Use start()
⭐ It is less flexible because of inheritance limitation
 */
