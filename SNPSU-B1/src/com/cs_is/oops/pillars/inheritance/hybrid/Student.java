package com.cs_is.oops.pillars.inheritance.hybrid;
interface Sports{
    void play();
}
class Person {
    String name;
    Person(String name){
        this.name = name;
    }
}
public class Student extends Person implements Sports {
    Student(String name){
        super(name); // Here we call the parent class constructor
    }
    @Override
    public void play(){
        System.out.println(name + " plays football.");
    }
}
class Demo {
    public static void main(String[] args) {
        Student student = new Student("Anup");
        student.play();
    }
}
