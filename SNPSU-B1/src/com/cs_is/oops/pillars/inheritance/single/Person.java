package com.cs_is.oops.pillars.inheritance.single;
public class Person {
    String name;
    Person(String name){
        this.name = name;
    }
}
class Student extends Person{
    int rollNo;
    Student(int rollNo, String name){
        super(name);
        this.rollNo = rollNo;
    }
    void display(){
        System.out.println(rollNo + " " + name);
    }
    public static void main(String[] args) {
        Student s = new Student(101, "Rahul");
        s.display();
    }
}

/*
Points to remember
✅ super.something -> variable or method from parent class
☑ super() -> parent class constructor
❌ super. -> Don't use for constructor ️
 */
