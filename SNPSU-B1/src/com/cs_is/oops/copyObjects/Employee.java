package com.cs_is.oops.copyObjects;
public class Employee {
    int id;
    String name;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println(id + " " + name);
    }
    // static copy method
    static Employee copy(Employee e){
        return new Employee(e.id, e.name);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Amit");
        Employee e2 = Employee.copy(e1); // Correct use
        // Employee e3 = e2; // Not recommended! Can lead to errors!
        e2.display();
    }
    static {
        System.out.println("Start of Execution!");
        System.out.println("Db-Loading");
        System.out.println("Internet Protocols Loading");
        System.out.println("System Files Loading");
    }
}
